/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.BookDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public interface BookService extends SuperService {

    String save(BookDto dto) throws Exception;

    String update(BookDto dto) throws Exception;

    String delete(String bookId) throws Exception;
    
     BookDto get(String bookId) throws Exception;

    ArrayList<BookDto> getAll() throws Exception;
}
