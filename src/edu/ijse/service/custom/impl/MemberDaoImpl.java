/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import java.sql.ResultSet;
import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.MemberDao;
import edu.ijse.entity.MemberEntity;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public class MemberDaoImpl implements MemberDao {

    @Override
    public boolean create(MemberEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO members VALUES(?,?)", t.getMemberId(), t.getMemberName());
    }

    @Override
    public boolean update(MemberEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE members SET member_name=? WHERE member_id=?", t.getMemberName(), t.getMemberId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM members WHERE member_id=?", id);
    }

    @Override
    public MemberEntity get(String id) throws Exception {
        ResultSet resultSet = CrudUtil.excecuteQuery("SELECT * FROM members WHERE member_id=?", id);
        if (resultSet.next()) {
            MemberEntity memberEntity = new MemberEntity(resultSet.getString("member_id"), resultSet.getString("member_name"));
            return memberEntity;
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntitys = new ArrayList<>();
        ResultSet resultSet = CrudUtil.excecuteQuery("SELECT * FROM members");
        while (resultSet.next()) {
            MemberEntity memberEntity = new MemberEntity(resultSet.getString("member_id"), resultSet.getString("member_name"));
            memberEntitys.add(memberEntity);
        }
        return memberEntitys;
    }

}
