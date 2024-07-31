/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.CategoryDao;
import edu.ijse.dao.CrudUtil;
import edu.ijse.entity.CategoryEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Dimuthu
 */
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public boolean create(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO categories VALUES(?,?)", t.getCategoryId(), t.getCategoryName());
    }

    @Override
    public boolean update(CategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE categories SET category_name=? WHERE category_id=?", t.getCategoryName(), t.getCategoryId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM categories WHERE category_id=? ", id);
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        ResultSet resultSet = CrudUtil.excecuteQuery("SELECT * FROM categories WHERE category_id=?", id);
        if (resultSet.next()) {
            CategoryEntity categoryEntity = new CategoryEntity(resultSet.getString("category_id"), resultSet.getString("Category_name"));
            return categoryEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntitys = new ArrayList<>();
        ResultSet resultSet = CrudUtil.excecuteQuery("SELECT * FROM categories");
        while (resultSet.next()) {
            CategoryEntity categoryEntity = new CategoryEntity(resultSet.getString("category_id"), resultSet.getString("category_name"));
            categoryEntitys.add(categoryEntity);
        }
        return categoryEntitys;
    }

//    public ArrayList<CategoryEntity> getAllCategoryNames() throws Exception {
//          ArrayList<CategoryEntity> categoryEntitys = new ArrayList<>();
//           ResultSet resultSet = CrudUtil.excecuteQuery("SELECT category_name FROM categories");
//                   while (resultSet.next()) {
//            CategoryEntity categoryEntity = new CategoryEntity(resultSet.getString("category_id"), resultSet.getString("category_name"));
//            categoryEntitys.add(categoryEntity);
//        }
//           
//    }

}
