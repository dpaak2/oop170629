package com.hanbit.oop.inheritance;

public class Iphone extends CellPhone {
	protected String data;
	public final static String  BRAND="I-Phone";
	public final static String 	KIND="스마트폰";
	public void setData(String data){
		super.setPortable(true);
		this.data=data;
		//portable=true;
	}
	public String getData(){
		return data;
	}
	@Override
	public String toString(){
		//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로 
		//아이폰을 사용해서 안녕이라고 문자를 전송했다. 
		return String.format("%s 이기때문에 %s 상태로 %s에게  %s 번호로 %s 를 사용해서 %s 라고 문자를 전송했다."
				,KIND,move,super.name,super.phoneNo,BRAND,data);
	}
}
