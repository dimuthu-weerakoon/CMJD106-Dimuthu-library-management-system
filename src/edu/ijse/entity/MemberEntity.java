/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author Dimuthu
 */
public class MemberEntity {

    private String memberId;
    private String memberName;

    public MemberEntity() {
    }

    public MemberEntity(String memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "MemberEntity{" + "memberId=" + memberId + ", memberName=" + memberName + '}';
    }

}
