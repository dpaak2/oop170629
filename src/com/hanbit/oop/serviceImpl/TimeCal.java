package com.hanbit.oop.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* 초를 시간과 분으로 바꾸어 주는 프로그램입니다.
초를 입력해주세요.
60000
60000초 =16시간 40분 0초
*/

public class TimeCal {
	public String timeCal(int input) {
		int hour = input / 3600;
		int min = (input - (hour * 3600)) / 60;
		int sec = input - ((hour * 3600) + (min * 60));
		
		String time= hour+","+min+","+sec;
		return time;

	}

}
