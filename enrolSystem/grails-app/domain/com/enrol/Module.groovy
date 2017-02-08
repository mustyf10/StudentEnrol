package com.enrol

class Module {
	String title
	String code
	int credits
	Lecturer lecturer
	String description
static hasMany=[courses:Course,students:Student]
static belongsTo=Course,Student]
	static constraints = {
		title blank:false, nullable:false
		code blank:false, nullable:false
		credits blank:false, nullable:false, minSize:20, maxSize:120
		lecturer blank:false, nullable:false
		description blank:false, nullable:false, maxSize:5000, widget:'textarea'

    }
}
