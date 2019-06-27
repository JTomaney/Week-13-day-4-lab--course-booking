package com.codeclan.example.CourseBookingSystem.controllers;

import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{id}")
    public List<Customer> findCustomersByBookings_CourseId(@PathVariable Long id) {
        return customerRepository.findCustomersByBookings_CourseId(id);
    }

    @GetMapping(value = "/town/{town}/course/{id}")
    public List<Customer> findCustomersByTownAndBookings_CourseId(@PathVariable String town, @PathVariable Long id) {
        String capTown = StringUtils.capitalize(town);
        return customerRepository.findCustomersByTownAndBookings_CourseId(capTown, id);
    }

}
