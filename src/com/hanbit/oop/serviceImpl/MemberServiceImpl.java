package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberBean session;

	public void MemberServiceImpl() {
		session = new MemberBean();

	}

	@Override
	public String getGender(MemberBean member) {
		String gender = "";
		switch (member.getSsn().charAt(7)) {
		case '1':
		case '3':
			gender = "남자";
			break;
		case '2':
		case '4':
			gender = "여자";
			break;
		case '5':
		case '6':
			gender = "외국인";
			break;
		default:
			gender = "다시 입력하여 주십시오";
			break;
		}
		return gender;
	}

	@Override
	public String getAge(MemberBean member) {
		int age=0;
		int year=Integer.parseInt(member.getSsn().substring(0, 1));
		int gap=17-Integer.parseInt(member.getSsn().substring(0, 1));
		if(gap>=0){
			age=2017-(year+2000)+1;
		}else{
			age=2017-(year+1900)+1;
		}
		return String.valueOf(age);
	}

	@Override
	public String join(MemberBean member) {
		String result = "환영합니다";
		session = member;
		return result;
	}

	@Override
	public String login(MemberBean member) {
		return (session.getId().equals(member.getId())&&session.getPw().equals(member.getPw()))?"Welcome  "+session.getName()+" ("+getAge(session)+","+getGender(session)+")": "plz check your ID or password";
	}

}
