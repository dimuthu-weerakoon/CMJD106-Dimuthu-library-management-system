/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.BorrowingDao;
import edu.ijse.dao.DaoFactory;
import edu.ijse.dto.BorrowingDto;
import edu.ijse.entity.BorrowingEntity;
import edu.ijse.service.custom.BorrowingService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public class BorrowingServiceImpl implements BorrowingService {

    private BorrowingDao borrowingDao = (BorrowingDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BORROWING);

    @Override
    public String save(BorrowingDto borrowingDto) throws Exception {
        BorrowingEntity borrowingEntity = getBorrowingEntity(borrowingDto);
        return borrowingDao.create(borrowingEntity) ? "Sucess" : "Failed";
    }

    @Override
    public String update(BorrowingDto borrowingDto) throws Exception {
        BorrowingEntity borrowingEntity = getBorrowingEntity(borrowingDto);
        return borrowingDao.update(borrowingEntity) ? "Sucess" : "Failed";
    }

    @Override
    public String delete(String borrowingId) throws Exception {

        return borrowingDao.delete(borrowingId) ? "Sucess" : "Failed";
    }

    @Override
    public BorrowingDto get(String borrowingId) throws Exception {
        BorrowingEntity borrowingEntity = borrowingDao.get(borrowingId);
        if (borrowingEntity != null) {
            return getBorrowingDto(borrowingEntity);
        }
        return null;
    }

    @Override
    public ArrayList<BorrowingDto> getAll() throws Exception {

        ArrayList<BorrowingEntity> borrowingEntitys = borrowingDao.getAll();

        if (borrowingEntitys != null && !borrowingEntitys.isEmpty()) {
            ArrayList<BorrowingDto> borrowingDtos = new ArrayList<>();
            for (BorrowingEntity borrowingEntity : borrowingEntitys) {
                borrowingDtos.add(getBorrowingDto(borrowingEntity));
            }
            return borrowingDtos;
        }
        return null;
    }

    private BorrowingEntity getBorrowingEntity(BorrowingDto borrowingDto) {
        return new BorrowingEntity(
                borrowingDto.getBorrowing_id(),
                borrowingDto.getBook_id(),
                borrowingDto.getMember_id(),
                borrowingDto.getBorrow_date(),
                borrowingDto.getDue_date(),
                borrowingDto.getReturn_date());
    }

    private BorrowingDto getBorrowingDto(BorrowingEntity borrowingEntity) {
        return new BorrowingDto(
                borrowingEntity.getBorrowing_id(),
                borrowingEntity.getBook_id(),
                borrowingEntity.getMember_id(),
                borrowingEntity.getBorrow_date(),
                borrowingEntity.getDue_date(),
                borrowingEntity.getReturn_date());
    }

}
