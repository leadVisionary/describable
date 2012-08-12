package com.visionarysoftwaresolutions.describable

class DescribableSpec extends spock.lang.Specification {
	Describable toTest
	
	def setup(){
		toTest = new Book("Lord of the Rings", "Awesome!!!")
	}
	
	def "get name"(){
		when: "I ask for the name of my describable"
			def result = toTest.name
		then: "the name should be Lord of the Rings"
			result == "Lord of the Rings" 
	}
	
	def "get description"(){
		when: "I ask for the description of my describable"
			def result = toTest.description
		then: "the description should be Awesome!!!"
			result == "Awesome!!!"
	}
}
