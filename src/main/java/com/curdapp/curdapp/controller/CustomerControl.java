package com.curdapp.curdapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.curdapp.curdapp.entity.Customer;
import com.curdapp.curdapp.services.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomerControl {
    @Autowired
	private CustomerService customerService;
	
    @PostMapping("/")
    public Customer postCustomer(@RequestBody Customer customer) {
    	return ((CustomerService) customerService).postCustomer(customer);
    }
}
