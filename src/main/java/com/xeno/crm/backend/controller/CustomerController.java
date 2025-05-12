package com.xeno.crm.backend.controller;
import com.xeno.crm.backend.model.Customer;
import com.xeno.crm.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public Customer add(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}
