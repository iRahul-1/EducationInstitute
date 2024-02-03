package com.education.student;

import com.education.classcourse.Course;
import com.education.educationinstitute.EducationInstitute;
import com.education.offers.Offer;

public class Student {
	private String name="";
	private EducationInstitute institute;
	
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	public void viewCoursesAndFees() {
	  Course [] c = institute.getCourses();
	  for(int i = 0 ; i<c.length;i++) {
		  System.out.println(c[i]);
	  }
	}
	public void viewOffers() {
		Offer [] o = institute.getOffers();
		for(int i = 0;i<o.length;i++) {
			System.out.println(o[i]);
		}
	}
	public void enrollInCourse(int courseId){
		 institute.enrollStudentInCourse(courseId, name);
	 }
	
}
