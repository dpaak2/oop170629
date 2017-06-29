package com.hanbit.oop.service;
import java.util.Scanner;
public class LeapYear {
	public String yearCal(int year) {
		String result="";
		if(year%400 ==0){
			result="윤년입니다";
		}else if(year%100==0){
			result="평년입니다";
		}else if(year%4==0){
			result="윤년입니다";
		}else{
			result="평년입니다";
		}
		System.out.print("result: "+result);
		return result;
	}
}
