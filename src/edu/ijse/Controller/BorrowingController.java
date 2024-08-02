/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.dto.BorrowingDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.BorrowingService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public class BorrowingController {

    private BorrowingService borrowingService = (BorrowingService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BORROWING);
    
    public String save(BorrowingDto borrowingDto) throws Exception {
        return borrowingService.save(borrowingDto);
    }
    
    public String update(BorrowingDto borrowingDto) throws  Exception{
        return borrowingService.update(borrowingDto);
    }
    
    public String delete(String borrowingId) throws Exception{
        return borrowingService.delete(borrowingId);
    }
    
    public BorrowingDto get(String borrowingId) throws Exception{
        return borrowingService.get(borrowingId);
    }
    
    public ArrayList<BorrowingDto> getAll() throws Exception{
        return borrowingService.getAll();
    }
}
