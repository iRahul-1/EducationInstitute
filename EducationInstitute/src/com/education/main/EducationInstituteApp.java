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
             Course[] course2 = new Course[] {
                 new Course(200, "Advanced JAVA", 30000),
                 new Course(201, "Spring Framework", 35000),
                 new Course(202, "Hibernate", 25000)
             };
             Offer[] offer2 = new Offer[] {
                 new Offer("Early bird discount: Enroll now and get 15% off!")
             };
             System.out.print("You Selected Option 2: ");
             System.out.println();
             System.out.print("Enter your name: ");
             String name2 = sc.next();
             EducationInstitute e2 = new EducationInstitute(course2, offer2);
             Student s2 = new Student(name2, e2);
             Thread t2 = new Thread() {
                 public void run() {
                     System.out.println("Available Course:");
                     s2.viewCoursesAndFees();
                     System.out.println("Available Offer:");
                     s2.viewOffers();
                     System.out.println("Student:");
                     s2.enrollInCourse(200);
                 }
             };
             t2.start();
             break;
         case 3:
             Course[] course3 = new Course[] {
                 new Course(300, "Python for Data Science", 20000),
                 new Course(301, "Machine Learning with Python", 30000),
                 new Course(302, "Django Web Development", 25000)
             };
             Offer[] offer3 = new Offer[] {
                 new Offer("Limited time offer: Get 10% off on all Python courses!")
             };
             System.out.print("You Selected Option 3: ");
             System.out.println();
             System.out.print("Enter your name: ");
             String name3 = sc.next();
             EducationInstitute e3 = new EducationInstitute(course3, offer3);
             Student s3 = new Student(name3, e3);
             Thread t3 = new Thread() {
                 public void run() {
                     System.out.println("Available Course:");
                     s3.viewCoursesAndFees();
                     System.out.println("Available Offer:");
                     s3.viewOffers();
                     System.out.println("Student:");
                     s3.enrollInCourse(300);
                 }
             };
             t3.start();
             break;
         case 4:
             Course[] course4 = new Course[] {
                 new Course(400, "Oracle Database Administration", 15000),
                 new Course(401, "SQL Fundamentals", 10000)
             };
             Offer[] offer4 = new Offer[] {
                 new Offer("Limited seats available: Enroll now and get 5% off!")
             };
             System.out.print("You Selected Option 4: ");
             System.out.println();
             System.out.print("Enter your name: ");
             String name4 = sc.next();
             EducationInstitute e4 = new EducationInstitute(course4, offer4);
             Student s4 = new Student(name4, e4);
             Thread t4 = new Thread() {
                 public void run() {
                     System.out.println("Available Course:");
                     s4.viewCoursesAndFees();
                     System.out.println("Available Offer:");
                     s4.viewOffers();
                     System.out.println("Student:");
                     s4.enrollInCourse(400);
                 }
             };
             t4.start();
             break;
         default:
             System.out.println("Invalid option selected!");
		}
		sc.close();

	}

}
