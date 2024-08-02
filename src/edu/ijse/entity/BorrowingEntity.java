/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author Dimuthu
 */
public class BorrowingEntity {

    private String borrowing_id;
    private String book_id;
    private String member_id;
    private String borrow_date;
    private String due_date;
    private String return_date;

    public BorrowingEntity() {
    }

    public BorrowingEntity(String borrowing_id, String book_id, String member_id, String borrow_date, String due_date, String return_date) {
        this.borrowing_id = borrowing_id;
        this.book_id = book_id;
        this.member_id = member_id;
        this.borrow_date = borrow_date;
        this.due_date = due_date;
        this.return_date = return_date;
    }

    /**
     * @return the borrowing_id
     */
    public String getBorrowing_id() {
        return borrowing_id;
    }

    /**
     * @param borrowing_id the borrowing_id to set
     */
    public void setBorrowing_id(String borrowing_id) {
        this.borrowing_id = borrowing_id;
    }

    /**
     * @return the book_id
     */
    public String getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    /**
     * @return the member_id
     */
    public String getMember_id() {
        return member_id;
    }

    /**
     * @param member_id the member_id to set
     */
    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    /**
     * @return the borrow_date
     */
    public String getBorrow_date() {
        return borrow_date;
    }

    /**
     * @param borrow_date the borrow_date to set
     */
    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    /**
     * @return the due_date
     */
    public String getDue_date() {
        return due_date;
    }

    /**
     * @param due_date the due_date to set
     */
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    /**
     * @return the return_date
     */
    public String getReturn_date() {
        return return_date;
    }

    /**
     * @param return_date the return_date to set
     */
    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    @Override
    public String toString() {
        return "BorrowingEntity{" + "borrowing_id=" + borrowing_id + ", book_id=" + book_id + ", member_id=" + member_id + ", borrow_date=" + borrow_date + ", due_date=" + due_date + ", return_date=" + return_date + '}';
    }
    
    
}
