package com.dl.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.dao.HondaDao;
import com.dl.model.Honda;

public class InsertClient {

	public static void main(String[] args) {
		
				
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/client/applicationContext.xml");
		HondaDao dao = (HondaDao)context.getBean("hondaDao");
		
		Honda h1=new Honda(1, "Honda-CBR","Black",350.00);
	       Honda h2=new Honda(2, "Honda-Shine","Yellow",155.00);
	       Honda h3=new Honda(3, "Honda-Activa","White",125.00);
	       Honda h4=new Honda(4, "Honda-Unicorn","Red",165.00);
	       
	       List<Honda> honda=new ArrayList<Honda>();
	       honda.add(h1);
	       honda.add(h2);
	       honda.add(h3);
	       honda.add(h4);
				
		
		int insertRecord = dao.insertRecord(honda);
		System.out.println("Data Inseterd: " + insertRecord);
		context.close();
		
		
	}
}