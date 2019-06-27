package com.codeclan.example.CourseBookingSystem.repositories;

import com.codeclan.example.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomersByBookings_CourseId(Long id);

    List<Customer> findCustomersByTownAndBookings_CourseId(String town, Long id);

    List<Customer> findCustomersByAgeGreaterThanAndTownAndBookings_CourseId(int age, String town, Long id);

}
