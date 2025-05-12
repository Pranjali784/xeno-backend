package com.xeno.crm.backend.repository;
import com.xeno.crm.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer, Long> {
  
}

