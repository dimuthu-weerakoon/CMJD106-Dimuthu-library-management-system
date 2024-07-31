/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.BookDao;
import edu.ijse.dao.DaoFactory;
import edu.ijse.dto.BookDto;
import edu.ijse.entity.BookEntity;
import edu.ijse.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(BookDto bookDto) throws Exception {
        BookEntity bookEntity = getBookEntity(bookDto);
        return bookDao.create(bookEntity) ? "Success" : "Failed";
    }

    @Override
    public String update(BookDto bookDto) throws Exception {
        BookEntity bookEntity = getBookEntity(bookDto);
        return bookDao.update(bookEntity) ? "Success" : "Failed";
    }

    @Override
    public String delete(String bookId) throws Exception {
        return bookDao.delete(bookId) ? "Success" : "Failed";
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
        ArrayList<BookEntity> bookEntitys = bookDao.getAll();
        if (bookEntitys != null && !bookEntitys.isEmpty()) {
            ArrayList<BookDto> bookDtos = new ArrayList<>();
            for (BookEntity bookEntity : bookEntitys) {
                bookDtos.add(getBookDto(bookEntity));
            }
            return bookDtos;
        }
        return null;
    }

    @Override
    public BookDto get(String bookId) throws Exception {
        BookEntity bookEntity = bookDao.get(bookId);
        if (bookEntity != null) {
            return getBookDto(bookEntity);
        }
        return null;
    }

    private BookEntity getBookEntity(BookDto bookDto) {
        return new BookEntity(
                bookDto.getBookId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getCategoryId());
    }

    private BookDto getBookDto(BookEntity bookEntity) {
        return new BookDto(bookEntity.getBookId(),
                bookEntity.getTitle(),
                bookEntity.getAuthor(),
                bookEntity.getCategoryId());
    }

}
