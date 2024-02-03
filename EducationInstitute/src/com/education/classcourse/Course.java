package com.education.classcourse;

public class Course {
	int id;
	String name;
	double fee;
	
	public Course() {
		super();	
	}
	public Course(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getFee() {
		return fee;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
}
