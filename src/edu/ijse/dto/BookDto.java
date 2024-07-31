/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author Dimuthu
 */
public class BookDto {

    private String bookId;
    private String title;
    private String author;
    private String categoryId;

    public BookDto() {
    }

    public BookDto(String bookId, String title, String author, String categoryId) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.categoryId = categoryId;
    }

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "BookDto{" + "bookId=" + getBookId() + ", title=" + getTitle() + ", author=" + getAuthor() + ", categoryId=" + getCategoryId() + '}';
    }

}
