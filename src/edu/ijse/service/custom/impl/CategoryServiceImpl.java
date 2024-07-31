/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.CategoryDao;
import edu.ijse.dao.DaoFactory;
import edu.ijse.dto.CategoryDto;
import edu.ijse.entity.CategoryEntity;
import edu.ijse.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);

    @Override
    public String save(CategoryDto categoryDto) throws Exception {
        CategoryEntity categoryEntity = getCategoryEntity(categoryDto);
        return categoryDao.create(categoryEntity) ? "Success" : "Failed";
    }

    @Override
    public String update(CategoryDto categoryDto) throws Exception {
        CategoryEntity categoryEntity = getCategoryEntity(categoryDto);
        return categoryDao.update(categoryEntity) ? "Success" : "Failed";
    }

    @Override
    public String delete(String categoryId) throws Exception {
        return categoryDao.delete(categoryId) ? "Success" : "Failed";
    }

    @Override
    public CategoryDto get(String categoryId) throws Exception {
        CategoryEntity categoryEntity = categoryDao.get(categoryId);
        if (categoryEntity != null) {
            return getCategoryDto(categoryEntity);
        }
        return null;
    }

    @Override
    public ArrayList<CategoryDto> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntitys = categoryDao.getAll();
        if (categoryEntitys != null && !categoryEntitys.isEmpty()) {
            ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
            for (CategoryEntity categoryEntity : categoryEntitys) {
                categoryDtos.add(getCategoryDto(categoryEntity));
            }
            return categoryDtos;
        }
        return null;
    }

    
    
    
    private CategoryEntity getCategoryEntity(CategoryDto categoryDto) {
        return new CategoryEntity(categoryDto.getCategoryId(), categoryDto.getCategoryName());
    }

    private CategoryDto getCategoryDto(CategoryEntity categoryEntity) {
        return new CategoryDto(categoryEntity.getCategoryId(), categoryEntity.getCategoryName());
    }

}
