package com.hanbit.oop.serviceImpl;

public class BmiService {
	private double height, weight,bmis;
	public double getBmis() {
		return bmis;
	}

	public void setBmis(double bmis) {
		this.bmis =  weight / (height * height);
	}

	private String calcBmit;
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String calcBmi() {
		setBmis(bmis);
		String result="";
		System.out.print("BMI: " + bmis + "\n");
		if (30.0 < bmis) {
			result = "비만 입니다";
		} else if (25.0 < bmis) {
			result = "과체중 입니다";
		} else if (18.5 < bmis) {
			result = "정상 입니다";
		} else {
			result = "저체중 입니다";
		}
		return result;
	}
}
