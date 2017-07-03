package com.hanbit.oop.inheritance;

public class AndroidPhone extends Iphone {
    //BRAND : Galaxy note 
	// data 를 오버라이딩 카톡 메세지라고 출력시킴
	private String size,appl;
	private final static String BRAND="Galaxy";
	public void setSize(String size){
		setPortable(true);
		this.size=size;
	}
	public String getSize(){
		return size;
	}
	@Override
	public void setData(String data){
		this.data=data;
	}
	public String getData(){
		return data;
	}
	public void setAppl(String appl){
		this.appl=appl;
	}
	public String getAppl(){
		return appl;
	}
	@Override
	public String toString(){
		//스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로 
		//갤럭식노트 6인치를 사용해서 안녕이라고 카톡을 전송했다. 
		return String.format("%s 이기때문에 %s 상태로 %s에게  %s 번호로 %s %s를 사용해서 %s 라고 %s 을 전송했다."
				,KIND,move,name,phoneNo,BRAND,size,data,appl);
	}
}
