/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.Controller;

import edu.ijse.dto.MemberDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author Dimuthu
 */
public class MemberController {

    private MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);

    public String save(MemberDto memberDto) throws Exception {
        return memberService.save(memberDto);
    }

    public String update(MemberDto memberDto) throws Exception {
        return memberService.update(memberDto);
    }

    public String delete(String memberId) throws Exception {
        return memberService.delete(memberId);
    }

    public MemberDto get(String memberId) throws Exception {
        return memberService.get(memberId);
    }

    public ArrayList<MemberDto> getAll() throws Exception {
        return memberService.getAll();
    }
}
