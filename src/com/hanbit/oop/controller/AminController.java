package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AminController {
	public static void main(String[] args) {
		String sCount = JOptionPane.showInputDialog("관리자님 총회원수를 입력하여 주세요");
		String sList = "";
		AdminService service = new AdminServiceImpl(sCount);
		// int i = 0;
		// MemberBean bean = new MemberBean();
		MemberBean bean = null;
		while (true) {

			switch (JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수 3.회원 목록 4.find by id 5.find by name 6.Update PassWord")) {
			case "0":
				JOptionPane.showMessageDialog(null, "Admin service close");
				return;
			case "1":
				bean =new MemberBean();
				String[] arr = JOptionPane.showInputDialog("Name/ID/Pass/SSN").split("/");
				String name = arr[0];
				System.out.println("controller name: " + name);
				bean.setName(arr[0]);
				bean.setId(arr[1]);
				bean.setPw(arr[1]);
				bean.setSsn(arr[2]);
				service.addMember(bean);
				JOptionPane.showMessageDialog(null, "회원 가입 성공");
				break;

			case "2":
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;

			case "3":
				MemberBean[] list = service.getMembers();
				JOptionPane.showMessageDialog(null, "1번째" + list[0]);
				JOptionPane.showMessageDialog(null, "2번째" + list[1]);
				for (int i = 0; i < list.length; i++) {
					sList += list[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, sList);
				break;

			case "4":
				// String id= JOptionPane.showInputDialog("찾으실 ID로 검색하여 주세요");
				
				JOptionPane.showMessageDialog(null,service.findById(JOptionPane.showInputDialog("찾으실 ID로 검색하여 주세요")).toString());
				break;
			case "5":
				// bean=new MemberBean();
				String searchName = JOptionPane.showInputDialog("찾으실 이름으로 검색하여 주세요");
				MemberBean[] members = service.findByName(searchName);
				String result = "";
				if (members.length == 0) {
					result="조회된 검색 결과가 없습니다.";
				} else {
					for (int i = 0; i < members.length; i++) {
						result += members[i].toString() + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, result);
				// JOptionPane.showMessageDialog(null,
				// service.findByName(JOptionPane.showInputDialog("찾으실 이름으로 검색하여
				// 주세요")));
				break;
			case"6":
				MemberBean mem=new MemberBean();
				String updateId=JOptionPane.showInputDialog("아이디를 입력하여 주세요");
				mem.setId(updateId);
				String newPass=JOptionPane.showInputDialog("새로운 비밀번호를 임력하여 주세요");
				mem.setPw(newPass);
				service.updatePass(mem);
				break;
				
			}
			// i++;
		}
	}
}
