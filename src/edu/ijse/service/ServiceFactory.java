/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service;

import edu.ijse.service.custom.impl.BookServiceImpl;
import edu.ijse.service.custom.impl.CategoryServiceImpl;
import edu.ijse.service.custom.impl.MemberServiceImpl;

/**
 *
 * @author Dimuthu
 */
public class ServiceFactory {

    public static ServiceFactory serviceFactory;

    public ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceType serviceType){
        switch (serviceType) {
            case BOOK:
                return new BookServiceImpl();
            case CATEGORY:
                return new CategoryServiceImpl();
            case MEMBER:
                return new MemberServiceImpl();
            default:
                return null;
        }
    }

    public enum ServiceType {
        BOOK,CATEGORY,MEMBER
    }
}
