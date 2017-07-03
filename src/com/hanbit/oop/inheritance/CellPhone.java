package com.hanbit.oop.inheritance;

public class CellPhone extends Phone {
	protected boolean portable;
	protected String move;
	public final static String KIND="휴대폰";
	
	public void setPortable(boolean portable) {
		portable=true;
		if(portable){
			this.setMove("이동 가능");
		}else{
			this.setMove("이동 가능");
		}
		this.portable=portable;
	}

	public boolean isPortable() {
		return portable;
	}

	public void setMove(String move) {
		this.move = move;
	}

	public String getMove() {
		return move;
	}
	
	@Override
	public String toString(){
		return String.format("%s 이기때문에 %s 상태로 %s에게  %s 번호로 %s %s 를 사용해서 %s"
				,KIND,move,super.name,super.phoneNo,KIND,super.brand,super.call);
	}
}
