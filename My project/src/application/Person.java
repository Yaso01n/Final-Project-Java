package application;

import java.util.ArrayList;

public class Person {
protected String username;
protected String password;
protected int accountnumber;
protected ArrayList<String> studentcourses;
//constructors
public Person() {
}
public Person(String u , String p) {
	u= username;
	p= password;
}

public Person(ArrayList<String> s) {
	 s= studentcourses;
}

//setter and getter of user name
public void Setusername(String name) {
	this.username =name;
}
public String getusername() {
	return username;
}

//setter and getter of password
public void Setpassword(String password) {
	this.password =password;
}
public String getpassword() {
	return password;
}

//setter and getter of list
public void Setlist(ArrayList<String> list) {
	this.studentcourses =list;
}
public ArrayList<String> getlist() {
	return studentcourses;
}









}
