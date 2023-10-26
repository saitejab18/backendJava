package com.dl.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dl.model.Product;

@RestController
public class ProductController {
	
	private List<Product> products = new ArrayList<>();
	@GetMapping("/")
	public List<Product> userProducts(){
						
		Product p1 = new Product();
		p1.setId(1);
		p1.setUserName("saiteja");
		p1.setProductName("Washing Machine");
		p1.setUserContact(893568792L);
		p1.setProductPrice(40000);
		
		Product p2 = new Product();
		p2.setId(1);
		p2.setUserName("saiteja");
		p2.setProductName("Washing Machine");
		p2.setUserContact(893568792L);
		p2.setProductPrice(40000);
		
		products.add(p1);
		products.add(p2);
		
		
		return products;
		
	}

}
