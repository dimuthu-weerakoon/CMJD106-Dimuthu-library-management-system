/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao;

import edu.ijse.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dimuthu
 */
public class CrudUtil {

    public static PreparedStatement getPreparedStatement(String sql, Object... args) throws SQLException, Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                statement.setObject(i + 1, args[i]);
            }
        }
        return statement;
    }

    public static boolean executeUpdate(String sql, Object... args) throws SQLException, Exception {
        return getPreparedStatement(sql, args).executeUpdate() > 0;
    }

    public static ResultSet excecuteQuery(String sql, Object... args) throws SQLException, Exception {
        return getPreparedStatement(sql, args).executeQuery();
    }
;
}
