package com.hanbit.oop.service;

import java.util.Scanner;

public class CalcService {
	public String calcBmi(double height,double weight){
		double bmi= weight/(height*height);
		String result="";
		System.out.print("height in meter: "+height+"\t");
		System.out.print("BMI: "+bmi+"\n");
		if(30.0<bmi){
			result="비만 입니다";
		}else if(25.0<bmi){
			result="과체중 입니다";
		}else if(18.5<bmi){
			result="정상 입니다";
		} else {
			result="저체중 입니다";
		}
		return result;
	}
	public String calcPlus(int firstNumber,int secondNumber){
		return String.valueOf(firstNumber+secondNumber);
	}
	public String clacMinus(String a,String b){
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	public String clacDevid(String a,String b){
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
	public String clacMultiple(String a,String b){
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	public String clacTime(int a,int b){
		String calcMinus="";
		calcMinus=String.valueOf(a-b);
		return calcMinus;
	}
}
