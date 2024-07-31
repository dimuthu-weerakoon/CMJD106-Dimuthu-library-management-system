/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author Dimuthu
 */
public class CategoryEntity {

    private String categoryId;
    private String CategoryName;

    public CategoryEntity() {
    }

    public CategoryEntity(String categoryId, String CategoryName) {
        this.categoryId = categoryId;
        this.CategoryName = CategoryName;
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

    /**
     * @return the CategoryName
     */
    public String getCategoryName() {
        return CategoryName;
    }

    /**
     * @param CategoryName the CategoryName to set
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "categoryId=" + categoryId + ", CategoryName=" + CategoryName + '}';
    }

}
