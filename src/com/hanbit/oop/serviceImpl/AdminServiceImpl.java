package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class AdminServiceImpl implements AdminService {

	int count;
	MemberBean member;
	MemberBean[] list;
/*	public AdminServiceImpl(int count){
		count=0;
		member=new MemberBean();
		//list=new MemberBean[countMebers()];
		list = new MemberBean[count];
	}
	
	*/
	//MemberBean mem= new MemberBean();
	
	public AdminServiceImpl(String sCount){
		count=0;
		member=new MemberBean();
		int count=Integer.parseInt(sCount);
		list=new MemberBean[count]; //회원수 받은만큼 배열수 방만듬
		//방 개수를 만들어주고 
	}
	
	@Override
	public void addMember(MemberBean bean) {
		list[count]=bean; //i번째 방에 값읋너엊후고 
		// 생성자에서 방을 이미 만들어주고 배열로 가지고 와서 , i번째 가지고 와서 
		for(int i=0;i<(count+1);i++){
			System.out.println(list[i].toString());
		}
		count++;
	}
	@Override
	public int countMembers() {
		return count; //memberList.length;
	}

	@Override
	public MemberBean[] getMembers() {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		return list;
	}

	@Override
	public MemberBean findById(String id) {
		for(int i=0;i<list.length;i++){
			if(id.equals(list[i].getId())){
				member=list[i];
				break;
			}
		}
		System.out.println(member.toString());
		return member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		  int a = 0;
		   for(int i=0; i<list.length; i++){
		      if(name.equals(list[i].getName())){
		         a++;
		      }
		   }
		   MemberBean[] nameList = new MemberBean[a];
		   int j=0;
		   for(int i=0; i<list.length; i++){
			  
		      if(name.equals(list[i].getName())){
		         nameList[j] = list[i];
		         j++;
		         if(a==j){
						break;   
					   }
		      }
		     
		   }
		   return nameList;
	}

	@Override
	public void updatePass(MemberBean bean) {
		member=new MemberBean();
		findById(bean.getId());
		System.out.println("바뀔아이디: "+bean.getId());
		System.out.println("새로운 비번: "+bean.getPw());
		System.out.println("기존 아이디: "+member.getId());
		System.out.println("기존 비밀번호"+member.getPw());
		System.out.println("바뀌기전 정보: "+member.toString());
		member.setPw(bean.getPw());
		
		/*	if(bean.getId().equals(member.getId())){
			member.setPw(bean.getPw());
		}*/
		System.out.println("바뀐정보: "+member.toString());
		System.out.println("새로운 비밀번호는? "+member.getPw());
	}

	
}