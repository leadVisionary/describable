package com.visionarysoftwaresolutions.describable

class Book implements Describable {
	String name
	String description
	
	public Book(String name, String description){
		this.name = name
		this.description = description
	} 
}
