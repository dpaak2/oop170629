package com.hanbit.oop.controller;
import javax.swing.*;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;
public class GradeController {
	public static void main(String[] args) {
		GradeBean grade=new GradeBean();
		GradeService service=new GradeService();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료  1.학점계산")) {
			case "0":return;
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
