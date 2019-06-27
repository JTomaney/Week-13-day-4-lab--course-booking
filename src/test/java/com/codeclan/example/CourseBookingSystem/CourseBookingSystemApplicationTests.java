package com.codeclan.example.CourseBookingSystem;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void canGetCoursesByrating() {
		List<Course> found = courseRepository.findCoursesByStarRating(4);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetCustomersForACourse() {
		List<Customer> found = customerRepository.findCustomersByBookings_CourseId(3L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetCoursesForACustomer() {
		List<Course> found = courseRepository.findCoursesByBookings_CustomerId(1l);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetBookingsForDate() {
		List<Booking> found = bookingRepository.findBookingsByDate("27-08-19");
		assertEquals(2, found.size());
	}

	@Test
	public void canfindCustomersByTownAndBookings_CourseId() {
		List<Customer> found = customerRepository.findCustomersByTownAndBookings_CourseId("Edinburgh", 1L);
		assertEquals(1, found.size());
	}

	@Test
	public void findCustomersByAgeGreaterThanAndTownAndBookings_CourseId() {
		List<Customer> found = customerRepository.findCustomersByAgeGreaterThanAndTownAndBookings_CourseId(30, "Glasgow", 3L);
		assertEquals(1, found.size());
	}

}
