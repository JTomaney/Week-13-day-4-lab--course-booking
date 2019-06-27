package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Bill", "Edinburgh", 57);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Bob", "Edinburgh", 44);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Jeb", "Glasgow", 84);
        customerRepository.save(customer3);

        Course course1 = new Course("Billing 101", "Edinburgh", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Billing 102", "Edinburgh", 3);
        courseRepository.save(course2);

        Course course3 = new Course("Basic Rocket Science", "Inverness", 4);
        courseRepository.save(course3);

        Booking booking1 = new Booking("30-06-18", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("10-07-19", customer1, course2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("27-08-19", customer3, course3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("27-08-19", customer2, course3);
        bookingRepository.save(booking4);

    }
}
