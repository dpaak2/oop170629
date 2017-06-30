package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.BmiService;
import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.GradeService;
import com.hanbit.oop.service.LeapYear;
import com.hanbit.oop.service.TaxCalc;
import com.hanbit.oop.service.TimeCal;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Controller {
	public static void main(String[] args) {
		/* Stream을 만드는데 0 은 종료 1은 시작 */
		Scanner s = new Scanner(System.in);
		CalcService service= new CalcService();
		TaxCalc tax=new TaxCalc();
		TimeCal timeCal=new TimeCal();
		LeapYear leapYear=new LeapYear();
		GradeService gradeReport =new GradeService();
		BmiService bmiService= new BmiService();
		while (true) {
			System.out.println("실행할 동작을 입력하여 주세요 0.STOP , 1.BMI , 2.TAX , 3PLUS , 4.MINUS, 5.TIMECALC, 6.LEAPYEAR, 7.GRADE REPORT ,8.CALENDER");
			switch (s.next()) {
			case "0":
				System.out.println("system close");
				return;
			case "1":
				System.out.print("나의 BMI 지수는? \n");
				System.out.print("insert your height: \n");
				double height=s.nextDouble()/100;
				bmiService.setHeight(height);
				System.out.print("insert your weight: \n");
				double weight=s.nextDouble();
				bmiService.setWeight(weight);
				
				String result= bmiService.calcBmi();
			    System.out.print("당신은 "+result+"\n");
				break;
			case "2":
				System.out.print("Name: ");
				String name = s.next();
				System.out.print("Salary: ");
				int salary = s.nextInt();
				double taxRate= tax.taxCalc(salary);
				
				  System.out.print("***********************************\n");
				  System.out.print("| 이름 | 연봉 | 세율 | 납부할 세금 |\n");
			      System.out.print("-----------------------------------\n");
    System.out.print(String.format("| %s 님| %d 만원 | %f | %d 만원 | \n",name,salary,taxRate,(int)(salary*taxRate)));
	              System.out.print("*********************************** \n");
				break;
				
			case "3":
				System.out.print("계산기\n");
				System.out.print("첫번째 숫자 입력: \n");
				int firstNumber = s.nextInt();
				System.out.print("두번째 숫자 입력: \n");
				int secondNumber = s.nextInt();
				int result2 = Integer.valueOf(service.calcPlus(firstNumber,secondNumber));
				System.out.print("Result: " + result2);
				break;
				
			case "4":
				System.out.print("Frist Number: \n");
				String a = s.next();
				System.out.print("Second Number: \n");
				String b = s.next();
				int c = Integer.valueOf(service.clacMinus(a,b));
				System.out.print("결과:" + c+"\n");
				break;
			case "5": 
				System.out.print("초를 입력해주세요! \n");
				int input =s.nextInt();
				String timeResult=timeCal.timeCal(input);
				int hour=Integer.parseInt(timeResult.split(",")[0]);
				int min=Integer.parseInt(timeResult.split(",")[1]);
				int sec=Integer.parseInt(timeResult.split(",")[2]);
				System.out.println(hour+"시간 "+min+"분"+sec+" 초");
				break;
			case "6": 
				System.out.print("검색할 년도를 입력하세요");
				int year=s.nextInt();
				String LeapYearResult=leapYear.yearCal(year);
				System.out.println(LeapYearResult);
				break;
			/*case "7":
				System.out.print("Insert your name: ");
				String reportName = s.next();
				gradeReport.setName(reportName);
				System.out.println("what is your major?");
				String major= s.next();
				gradeReport.setMajor(major);
				System.out.print("Insert your score \n");
				System.out.print("Korean: ");
				int kor = s.nextInt();
				gradeReport.setKor(kor);
				System.out.print("English: ");
				int eng = s.nextInt();
				gradeReport.setEng(eng);
				System.out.print("Math: ");
				int math = s.nextInt();
				gradeReport.setMath(math);
				gradeReport.setGrade();
				System.out.println(gradeReport.toString());
				break;*/
			case "8":
				
				break;
			}
		}
	}
}
