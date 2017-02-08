package com.enrol

class Course {
	//variable declarations	
	String department
	String title
	String leader
	String code
	Date startDate
	Date endDate
	String description
	Boolean isItRunning
	int numberOfStudents
	double tuitionFees
	String studyMode
static hasMany=[students:Student,lecturers:Lecturer,modules:Module]
	
	double calculateFees(){
		4*tuitionFees
	}	 
	
	//constraints
    	static constraints = {
		title blank:false, nullable:false
		department blank:false, nullable:false
		leader blank:false, nullable:false
		code blank:false, nullable:false
		numberOfStudents blank:false, nullable:false, min:20, max:60
		startDate blank:false, nullable:false
		endDate blank:false, nullable:false
		studyMode blank:false, nullable:false, maxSize:20
		description blank:false, nullable:false, maxSize:5000, widget:'textarea'
		tuitionFees blank:false, nullable:false, scale:2
    	}
}
