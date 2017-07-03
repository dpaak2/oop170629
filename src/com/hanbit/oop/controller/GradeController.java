package com.hanbit.oop.controller;
import javax.swing.*;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.serviceImpl.GradeService2;
public class GradeController {
	public static void main(String[] args) {
		GradeBean grade=new GradeBean();
		GradeService2 service=new GradeService2();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료  1.학점계산")) {
			case "0":
				JOptionPane.showInternalMessageDialog(null, "system closed");
				return;
			case "1":
				grade.setName(JOptionPane.showInputDialog("name"));
				grade.setMajor(JOptionPane.showInputDialog("Major"));
				grade.setKor(JOptionPane.showInputDialog("Korean Score"));
				grade.setEng(JOptionPane.showInputDialog("English Score"));
				grade.setMath(JOptionPane.showInputDialog("Math Score"));
				JOptionPane.showMessageDialog(null,service.getGrade(String.valueOf(service.getAvg(String.valueOf(service.getTotal(grade))))));
				break;
			}
		}
	}
}
