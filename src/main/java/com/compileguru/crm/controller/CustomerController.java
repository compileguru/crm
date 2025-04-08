package com.compileguru.crm.controller;

import com.compileguru.crm.entity.Customer;
import com.compileguru.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public List<Customer> getCustomers() {
        return service.getAllCustomers();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }
}
