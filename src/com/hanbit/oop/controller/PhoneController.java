package com.hanbit.oop.controller;
import javax.swing.JOptionPane;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.Iphone;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args) {
		Phone phone=new Phone();
		CellPhone nokia=new CellPhone();
		Iphone iphone=new Iphone();
		AndroidPhone galaxy= new AndroidPhone();
		
		while (true) {
			switch(JOptionPane.showInputDialog("0.종료  1.Home 2.Nokia  3.I-Phone 4.Galaxy note")){
			case "0":
				JOptionPane.showMessageDialog(null, "전화 종료");
				return;
			case "1":
				phone.setPhoneNo(JOptionPane.showInputDialog("phoen number"));
				phone.setName(JOptionPane.showInputDialog("Name"));
				phone.setBrand(JOptionPane.showInputDialog("Brand"));
				phone.setCall(JOptionPane.showInputDialog("call"));
				
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case "2": 
				nokia.setPhoneNo(JOptionPane.showInputDialog("phoen number"));
				nokia.setName(JOptionPane.showInputDialog("Name"));
				nokia.setBrand(JOptionPane.showInputDialog("Brand"));
				nokia.setCall(JOptionPane.showInputDialog("call"));
				JOptionPane.showMessageDialog(null,nokia.toString());
				break;
			case"3": 
				iphone.setPhoneNo(JOptionPane.showInputDialog("phoen number"));
				iphone.setName(JOptionPane.showInputDialog("Name"));
				iphone.setData(JOptionPane.showInputDialog("message"));
				JOptionPane.showMessageDialog(null,iphone.toString());
				break;
			case "4": 
				galaxy.setPhoneNo(JOptionPane.showInputDialog("phoen number"));
				galaxy.setName(JOptionPane.showInputDialog("Name"));
				galaxy.setSize(JOptionPane.showInputDialog("Size"));
				galaxy.setData(JOptionPane.showInputDialog("message"));
				galaxy.setAppl(JOptionPane.showInputDialog("사용할 어플"));
				JOptionPane.showMessageDialog(null,galaxy.toString());
				break;
			}
		}
	}
}
