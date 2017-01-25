package com.enrol

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when: "A Student has a name, ID and course"
	def janet=new Student(name:'Janet Taylor',
	studentID:'45907812',
	course:'BSc Hon Engineering')

	then:"the to String method will merge them."
	
	janet.toString()=='Janet Taylor,45907812,BSc Hon Engineering'
    }
}
