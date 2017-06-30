package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public class GradeService {
	public int getTotal(GradeBean g) {
		int total=Integer.parseInt(g.getKor())+Integer.parseInt(g.getEng())+ Integer.parseInt(g.getMath());
		return total;
	}

	public int getAvg(String total) {
		int avg=Integer.parseInt(total)/3;
		return avg;
	}

	public String getGrade(String avg) {
	String grade="";
		switch ((Integer.parseInt(avg)/ 10)) {
		case 10:
			grade = "A 학점입니다.  장학금 대상입니다!";
			break;
		case 9:
			// A
			grade = "A 학점입니다.  장학금 대상입니다! ";
			break;
		case 8:
			// B
			grade = "B학점입니다.  3학점 이수";
			break;
		case 7:
			// c
			grade = "C학점입니다. 2학점 이수";
			break;
		case 6:
			// d
			grade = "D학점입니다. 1학점 이수";
			break;
		default:
			grade = " Fantastic do hard work!!!! 재수강";
			break;
		}
		return grade;
	}

}
