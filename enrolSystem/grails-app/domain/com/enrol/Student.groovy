package com.enrol
//class decleration
class Student {
	//variables
	String name
	String studentID
	Date dob
	Boolean isFundingAvailable
	String email
	String username
	String Password
	String course

	String toString() {
	"$name,$studentID,$course"
	}

	//constraints
    	static constraints = {
		name blank:false, nullable:false
		studentID blank:false, nullable:false
		dob blank:false, nullable:false
		email blank:false, nullable:false, email:true
		username blank:false, nullable:false, unique:true
		password blank:false, nullable:false
		isFundingAvailable blank:false, nullable:false
		course blank:false, nullable:false
    	}
}
