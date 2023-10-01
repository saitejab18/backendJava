package com.dl.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dl.model.Honda;

@Component("hondaDao")
public class HondaDaoImpl implements HondaDao {
	
	//field, has a relation
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertRecord(Honda honda) {
		
		String s1 = "insert into honda values (?,?,?,?)";
		int insert = jdbcTemplate.update(s1, honda.getId(), honda.getBikeName(), honda.getBikeColor(), honda.getCc());
		System.out.println("Record Inserted " + insert);
		return insert;
	}

	public int updateRecord(Honda honda) {
		
		return 0;
	}

	public int deleteRecord(int id) {
		
		return 0;
	}

	@Override
	public int insertRecord(List<Honda> honda) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}