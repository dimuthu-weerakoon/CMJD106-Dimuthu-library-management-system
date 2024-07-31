/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.MemberDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public interface MemberService extends SuperService {

    String save(MemberDto memberDto) throws Exception;

    String update(MemberDto memberDto) throws Exception;

    String delete(String memberId) throws Exception;

    MemberDto get(String memberId) throws Exception;

    ArrayList<MemberDto> getAll() throws Exception;
}
