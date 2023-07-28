package com.parthu.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.parthu.binding.Address;
import com.parthu.binding.Customer;

public class JsonConverter {

	public static void main(String[] args) throws Exception{

		Address ad=new Address();
		ad.setCity("Hyd");
		ad.setState("TN");
		ad.setCountry("Indian");
		
		Customer cust=new Customer();
		cust.setId(101);
		cust.setName("John");
		cust.setEmail("John@gmail.com");
		cust.setPhno(898676578);
		cust.setAdd(ad);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("customer.json"), cust);
	}

}
