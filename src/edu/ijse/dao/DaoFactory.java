/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao;

import edu.ijse.service.custom.impl.BookDaoImpl;
import edu.ijse.service.custom.impl.BorrowingDaoImpl;
import edu.ijse.service.custom.impl.CategoryDaoImpl;
import edu.ijse.service.custom.impl.MemberDaoImpl;

/**
 *
 * @author Dimuthu
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {

    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes daoTypes) {
        switch (daoTypes) {
            case BOOK:
                return new BookDaoImpl();
            case CATEGORY:
                return new CategoryDaoImpl();
            case MEMBER:
                return new MemberDaoImpl();
            case BORROWING:
                return new BorrowingDaoImpl();
            default:
                return null;
        }

    }

    public enum DaoTypes {
        BOOK, CATEGORY, MEMBER,BORROWING
    }
}
