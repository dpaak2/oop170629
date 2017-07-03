package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public interface GradeService {
	public int getTotal(GradeBean g);
	public int getAvg(String total);
	public String getGrade(String avg);
	
}
