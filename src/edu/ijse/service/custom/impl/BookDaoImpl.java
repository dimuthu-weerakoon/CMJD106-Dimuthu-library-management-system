/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.BookDao;
import edu.ijse.dao.CrudUtil;
import edu.ijse.entity.BookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Dimuthu
 */
public class BookDaoImpl implements BookDao {

    @Override
    public boolean create(BookEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO books VALUES(?,?,?,?)", t.getBookId(), t.getTitle(), t.getAuthor(), t.getCategoryId());
    }

    @Override
    public boolean update(BookEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE books SET title=?, author=?, category_id=? WHERE book_id=?", t.getTitle(), t.getAuthor(), t.getCategoryId(), t.getBookId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM books WHERE book_id=?", id);
    }

    @Override
    public BookEntity get(String id) throws Exception {
        ResultSet resultSet = CrudUtil.excecuteQuery("SELECT * FROM books WHERE book_id=?", id);
        if (resultSet.next()) {
            BookEntity bookEntity = new BookEntity(resultSet.getString("book_id"), resultSet.getString("title"), resultSet.getString("author"), resultSet.getString("category_id"));
            return bookEntity;
        }
        return null;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        ArrayList<BookEntity> bookEntitys = new ArrayList<>();
        ResultSet resultSet = CrudUtil.excecuteQuery("SELECT * FROM books");
        while (resultSet.next()) {
            BookEntity bookEntity = new BookEntity(resultSet.getString("book_id"), resultSet.getString("title"), resultSet.getString("author"), resultSet.getString("category_id"));
            bookEntitys.add(bookEntity);
        }
        return bookEntitys;
    }

}
