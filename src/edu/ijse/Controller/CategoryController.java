/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.dto.CategoryDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public class CategoryController {

    private CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);

    public String save(CategoryDto categoryDto) throws Exception {
        return categoryService.save(categoryDto);
    }

    public String update(CategoryDto categoryDto) throws Exception {
        return categoryService.update(categoryDto);
    }

    public String delete(String categoryId) throws Exception {
        return categoryService.delete(categoryId);
    }

    public CategoryDto get(String categoryId) throws Exception {
        return categoryService.get(categoryId);
    }

    public ArrayList<CategoryDto> getAll() throws Exception {
        return categoryService.getAll();
    }


}
