package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService {

	int i=0;
	MemberBean[] member;
	
	
	public AdminServiceImpl(String sCount){
		int count=Integer.parseInt(sCount);
		member=new MemberBean[count]; //회원수 받은만큼 배열수 방만듬
		//방개수를 만들어주고 
	}

	
//	MemberBean[] memberList = new MemberBean[];

	@Override
	public void addMember(MemberBean bean) {
		member[i]=bean; //i번째 방에 값읋너엊후고 
		// 생성자에서 방을 이미 만들어주고 배열로 가지고 와서 , i번째 가지고 와서 
		i++;
	}

	@Override
	public MemberBean[] getMembers() {
		return null;
	}

	@Override
	public int countMembers() {
		
		member.toString();
		return i; //memberList.length;
	}

}
