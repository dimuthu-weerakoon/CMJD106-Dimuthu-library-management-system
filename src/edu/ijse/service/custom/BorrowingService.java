/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.BorrowingDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public interface BorrowingService extends SuperService {

    String save(BorrowingDto borrowingDto) throws Exception;

    String update(BorrowingDto borrowingDto) throws Exception;

    String delete(String borrowingId) throws Exception;

    BorrowingDto get(String borrowingId) throws Exception;

    ArrayList<BorrowingDto> getAll() throws Exception;
}
