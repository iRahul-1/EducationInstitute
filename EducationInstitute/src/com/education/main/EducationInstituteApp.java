package com.education.main;

import java.util.Scanner;

import com.education.classcourse.Course;
import com.education.educationinstitute.EducationInstitute;
import com.education.offers.Offer;
import com.education.student.Student;

public class EducationInstituteApp {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------- Welcome to our Institute ---------------------");
		System.out.println();
		System.out.println("Availabe Courses: ");
		System.out.println("1 - C++");
		System.out.println("2 - JAVA");
		System.out.println("3 - PYTHON");
		System.out.println("4 - ORACLE");
		System.out.println();
		System.out.print("Select any option to Enroll: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Course [] course = new Course[] {
					new Course(100, "C++", 10000),
					new Course(101, "JAVA", 25000),
					new Course(102, "PYTHON", 15000),
					new Course(101, "ORACLE", 5000),
			};
			Offer [] offer = new Offer[] {
					new Offer("Special discount: Get 20% off on all courses!")
			};
			System.out.print("You Selected Option 1: ");
			System.out.println();
			System.out.print("Enter your name: ");
			String name = sc.nextLine();
			EducationInstitute e = new EducationInstitute(course, offer);
			Student s1 = new Student(name, e);
			Thread t1 = new Thread() {
				public void run() {
					System.out.println("Available Course:");
					s1.viewCoursesAndFees();
					System.out.println("Available Offer:");
					s1.viewOffers();
					System.out.println("Student:");
					s1.enrollInCourse(100);
				}
			};
			t1.start();
		case 2:
		case 3:
		case 4:
		}
		sc.close();

	}

}
