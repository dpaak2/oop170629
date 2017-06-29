package com.hanbit.oop.service;

import java.util.Scanner;

public class GradeReport {
	public void main() {
		int total = 0, kor = 0, math = 0, eng = 0, avg = 0;
		String result = "";
		
		
		total = kor + eng + math;
		avg = total / 3;
		String grade = "";
		/*
		 * if(89<avg){ result="A"; }else if(79<avg){ result="B"; }else
		 * if(69<avg){ result="C"; } else if(59<avg){ result="D"; }else{
		 * result="F   do hard work!!!!!! "; }
		 */

		switch (avg / 10) {
		case 10:
			grade = "A";
			result = "장학금 대상입니다. ";
			break;
		case 9:
			// A
			grade = "A";
			result = "장학금 대상입니다. ";
			break;
		case 8:
			// B
			grade = "B";
			result = "3학점 이수";
			break;
		case 7:
			// c
			grade = "C";
			result = "2학점 이수";
			break;
		case 6:
			// d
			grade = "D";
			result = "1학점 이수";
			break;
		default:
			result = " Fantastic do hard work!!!! 재수강";
			break;

		}

		System.out.print("*******************************\n");
		System.out.print("   이름   총점  평균  등급\n");
		System.out.print("--------------------------------\n");
		//System.out.print(String.format("| %s |  %d  |  %d  |  %s  | \n", name, total, avg, result));
		System.out.print("*******************************");
	}
}