package com.dl.dao;

import java.util.List;

import com.dl.model.Honda;

public interface HondaDao {

	public int insertRecord(List<Honda> honda);
	public int updateRecord(Honda honda);
	public int deleteRecord(int id);
	
}