package com.education.main;

import com.education.classcourse.Course;
import com.education.educationinstitute.EducationInstitute;
import com.education.offers.Offer;
import com.education.student.Student;

public class EducationInstituteApp {
	
	public static void main(String[] args) throws InterruptedException {
		
		Course [] course = new Course[] {
				new Course(101, "java", 25000),
				new Course(102, "python", 15000)};
		Offer [] offer = new Offer[] {
				new Offer("Special discount: Get 20% off on all courses!")
		};
		Course c = new Course();
		EducationInstitute e = new EducationInstitute(course, offer);
		Student s1 = new Student("John", e);
		Student s2 = new Student("Alice", e);
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Available Course:");
				s1.viewCoursesAndFees();
				System.out.println("Available Offer:");
				s1.viewOffers();
				System.out.println("Student:");
				s1.enrollInCourse(101);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Available Course:");
				s2.viewCoursesAndFees();
				System.out.println("Available Offer:");
				s2.viewOffers();
				System.out.println("Student :");
				s2.enrollInCourse(102);
			}
		};
		t1.start();
		t1.join();
		t2.start();
		

	}

}
