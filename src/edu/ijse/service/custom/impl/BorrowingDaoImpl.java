/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.BorrowingDao;
import edu.ijse.dao.CrudUtil;
import edu.ijse.entity.BorrowingEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Dimuthu
 */
public class BorrowingDaoImpl implements BorrowingDao {

    @Override
    public boolean create(BorrowingEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO borrowings VALUES(?,?,?,?,?,?)", t.getBorrowing_id(),
                t.getBook_id(), t.getMember_id(), t.getBorrow_date(), t.getDue_date(), t.getReturn_date()
        );
    }

    @Override
    public boolean update(BorrowingEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE borrowings SET book_id=?,member_id=?,borrow_date=?,due_date=?,return_date=? WHERE borrowing_id",
                t.getBook_id(), t.getMember_id(), t.getBorrow_date(), t.getDue_date(), t.getReturn_date(), t.getBorrowing_id()
        );
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM borrowings WHERE borrowing_id=? ", id);
    }

    @Override
    public BorrowingEntity get(String id) throws Exception {
        ResultSet resultSet = CrudUtil.excecuteQuery("SELECT * FROM borrowings WHERE borrowing_id=?", id);
        if (resultSet.next()) {
            BorrowingEntity borrowingEntity = new BorrowingEntity(
                    resultSet.getString("borrowing_id"),
                    resultSet.getString("book_id"),
                    resultSet.getString("member_id"),
                    resultSet.getString("borrow_date"),
                    resultSet.getString("due_date"),
                    resultSet.getString("return_date"));
            return borrowingEntity;
        }
        return null;

    }

    @Override
    public ArrayList<BorrowingEntity> getAll() throws Exception {
        ArrayList<BorrowingEntity> borrowingEntitys = new ArrayList<>();
        ResultSet resultSet = CrudUtil.excecuteQuery("SELECT * FROM borrowings");
        while (resultSet.next()) {
            BorrowingEntity borrowingEntity = new BorrowingEntity(
                    resultSet.getString("borrowing_id"),
                    resultSet.getString("book_id"),
                    resultSet.getString("member_id"),
                    resultSet.getString("borrow_date"),
                    resultSet.getString("due_date"),
                    resultSet.getString("return_date"));
            borrowingEntitys.add(borrowingEntity);
        }
        return borrowingEntitys;
        
    }

}
