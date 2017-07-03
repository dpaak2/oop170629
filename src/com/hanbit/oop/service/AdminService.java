package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface AdminService {
	public void addMember(MemberBean bean);
	public MemberBean[] getMembers();
	public int countMembers();
	//MemberBean[] list = new MemberBean[4];
}
