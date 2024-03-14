package com.curdapp.curdapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curdapp.curdapp.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
