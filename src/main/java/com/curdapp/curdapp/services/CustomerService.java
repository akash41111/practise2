package com.curdapp.curdapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdapp.curdapp.entity.Customer;
import com.curdapp.curdapp.repository.CustomerRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;
	
//	public Customer postCustomer(Customer customer) {
//		
//		return customerRepo.save(customer);
//	}

	public Customer postCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		Customer savedCustomer  =this.customerRepo.save(customer);
		
		return savedCustomer;
	}

	

	

}
