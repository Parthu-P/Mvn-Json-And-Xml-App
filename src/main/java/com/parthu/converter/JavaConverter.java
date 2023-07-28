package com.parthu.converter;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.parthu.binding.Customer;

public class JavaConverter {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File f=new File("customer.json");
		ObjectMapper mapper=new ObjectMapper();
		Customer c = mapper.readValue(f, Customer.class);
		System.out.println(c);
	}

}
