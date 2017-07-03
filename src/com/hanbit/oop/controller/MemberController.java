package com.hanbit.oop.controller;
import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;
import com.hanbit.oop.serviceImpl.MemberServiceImpl;
public class MemberController {
	public static void main(String[] args) {
		MemberService memService=new MemberServiceImpl();
		MemberBean member=new MemberBean();
		while(true){
			switch (JOptionPane.showInputDialog("0. 종료  1.회원등록   2.로그인")) {
			case "0":
				JOptionPane.showMessageDialog(null, "System closed ");
				return;
			case "1":
				member.setName(JOptionPane.showInputDialog("name"));
				member.setId(JOptionPane.showInputDialog("ID"));
				member.setPw(JOptionPane.showInputDialog("PassWord"));
				member.setSsn(JOptionPane.showInputDialog("SSN"));
				JOptionPane.showMessageDialog(null, memService.join(member));
				//String gender= memService.getGender();
				break;
			case "2":
				MemberBean temp=new MemberBean();
				temp.setId(JOptionPane.showInputDialog("Login ID"));
				temp.setPw(JOptionPane.showInputDialog("Login PassWord"));
				JOptionPane.showMessageDialog(null, memService.login(temp));
				break;
			}
		}
	}
}
