package com.hanbit.oop.serviceImpl;

import java.util.Scanner;

public class CalcService {

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
