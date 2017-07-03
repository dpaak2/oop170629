package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AminController {
	public static void main(String[] args) {
		String sCount = JOptionPane.showInputDialog("관리자님 총회원수를 입력하여 주세요");
		MemberBean bean = new MemberBean();
		AdminService service = new AdminServiceImpl(sCount);
		int i = 0;
		while (i < Integer.parseInt(sCount) + 1) {
			switch (JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수 3.회원 목록")) {
			case "0":
				JOptionPane.showMessageDialog(null, "Admin service close");
				return;
			case "1":
				bean.setName(JOptionPane.showInputDialog("name"));
				bean.setId(JOptionPane.showInputDialog("ID"));
				bean.setPw(JOptionPane.showInputDialog("Pass"));
				bean.setSsn(JOptionPane.showInputDialog("SSN"));
				service.addMember(bean);
				JOptionPane.showMessageDialog(null, "회원 가입 성공");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;
			case "3":
				
				JOptionPane.showMessageDialog(null, service.getMembers());
				break;

			}
			i++;
		}
	}
}
