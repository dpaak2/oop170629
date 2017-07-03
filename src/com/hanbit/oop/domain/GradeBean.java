package com.hanbit.oop.domain;

public class GradeBean {
	private String kor, eng, math,name,major;

	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
		return "==================== \n"
			 + "  이름   전공    성적 \n"
			  +"==================== \n"
			  +" "+ name+"\t"+major+"\t\n"
				+"==================== ";
	}
}
