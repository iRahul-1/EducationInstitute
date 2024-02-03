package com.education.educationinstitute;

import com.education.classcourse.Course;
import com.education.offers.Offer;

public class EducationInstitute {
	Course [] courses ;
	Offer [] offers;
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}
	public Course[] getCourses() {
		return courses;
	}
	public Offer[] getOffers() {
		return offers;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	public void setOffers(Offer[] offers) {
		this.offers = offers;
	}	
	public void enrollStudentInCourse(int courseId, String studentName){
		for(int i = 0 ; i < courses.length; i++) {
			if(courseId == courses[i].getId()) {
				System.out.println(studentName+" is enrolled");
				return;
			}else
			System.out.println("Student not Availabe:");
		}
	}
	
	
}
