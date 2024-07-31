/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.MemberDao;
import edu.ijse.dto.MemberDto;
import edu.ijse.entity.MemberEntity;
import edu.ijse.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public class MemberServiceImpl implements MemberService {

    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);

    @Override
    public String save(MemberDto memberDto) throws Exception {
        MemberEntity memberEntity = getMemberEntity(memberDto);
        return memberDao.create(memberEntity) ? "Success" : "Failed";
    }

    @Override
    public String update(MemberDto memberDto) throws Exception {
        MemberEntity memberEntity = getMemberEntity(memberDto);
        return memberDao.update(memberEntity) ? "Success" : "Failed";
    }

    @Override
    public String delete(String memberId) throws Exception {
        return memberDao.delete(memberId) ? "Success" : "Failed";
    }

    @Override
    public MemberDto get(String memberId) throws Exception {
        MemberEntity memberEntity = memberDao.get(memberId);
        if (memberEntity != null) {
            return getMemberDto(memberEntity);
        }
        return null;
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntities = memberDao.getAll();
        ArrayList<MemberDto> memberDtos = new ArrayList<>();
        if (memberEntities != null && !memberEntities.isEmpty()) {
            for (MemberEntity memberEntity : memberEntities) {
                memberDtos.add(getMemberDto(memberEntity));
            }
        }
        return memberDtos;
    }

    private MemberDto getMemberDto(MemberEntity memberEntity) {
        return new MemberDto(memberEntity.getMemberId(), memberEntity.getMemberName());

    }

    private MemberEntity getMemberEntity(MemberDto memberDto) {
        return new MemberEntity(memberDto.getMemberId(), memberDto.getMemberName());
    }
}
