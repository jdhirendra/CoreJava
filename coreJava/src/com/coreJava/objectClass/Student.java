package com.coreJava.objectClass;

public class Student {
String name;
int rollNumber;
String address;

public Student(String name, int rollNumber, String address) {
	super();
	this.name = name;
	this.rollNumber = rollNumber;
	this.address = address;
}

@Override
public String toString() {
	return "Student [name=" + name + ", rollNumber=" + rollNumber + ", address=" + address + "]";
}

}
