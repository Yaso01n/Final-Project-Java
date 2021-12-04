package application;

import java.util.ArrayList;

public class Courses  extends Person {
	public ArrayList<Person> studentcoursesdata = new ArrayList<>();
	
	public ArrayList<String> CoursesCodes = new ArrayList<>();
	public void codes() {
		CoursesCodes.add("MTH1212");
		CoursesCodes.add("CMP1231");
		CoursesCodes.add("ELC1213");
		CoursesCodes.add("CHE7098");
		CoursesCodes.add("BMP6143");
	}
	
	public ArrayList<String> CoursesNames = new ArrayList<>();
	public void Names() {
		CoursesNames.add("Math");
		CoursesNames.add("Programing Principles");
		CoursesNames.add("Electronics");
		CoursesNames.add("Chemical Engineering");
		CoursesNames.add("Biology and Medical physics");
	}	
	
	Person a1 = new Person();
	Person a2 = new Person();
	Person a3 = new Person();
	Student m = new Student();
	public void studentscourses() {
		codes();
//account1 courses
	    ArrayList<String> account1courses = new ArrayList<>();
		account1courses.add(CoursesCodes.get(0));
		account1courses.add(CoursesCodes.get(1));
		account1courses.add(CoursesCodes.get(2));
		a1.Setlist(account1courses);
		studentcoursesdata.add(a1);
//account2 courses	
		ArrayList<String> account2courses = new ArrayList<>();
		account2courses.add(CoursesCodes.get(0));
		account2courses.add(CoursesCodes.get(1));
		account2courses.add(CoursesCodes.get(2));
		account2courses.add(CoursesCodes.get(3));
		account2courses.add(CoursesCodes.get(4));
		a2.Setlist(account2courses);
		studentcoursesdata.add(a2);
//account3 courses
		ArrayList<String> account3courses = new ArrayList<>();
		account3courses.add(CoursesCodes.get(1));
		account3courses.add(CoursesCodes.get(2));
		account3courses.add(CoursesCodes.get(3));
		account3courses.add(CoursesCodes.get(4));
		a3.Setlist(account3courses);
		studentcoursesdata.add(a3);
		}
	
	
    
    public boolean checkcodes(String code) {
    	studentscourses();
    	int i = m.getaccountnumber();
    	
    		for(int k= 0 ; k < studentcoursesdata.get(i).getlist().toArray().length; k++) {
    			if(code.equals(studentcoursesdata.get(i).getlist().get(k)))
    		      return true;
    		}
    	
    	          return false;
    }
    
    
    
    public ArrayList<String> ListofCoursesCodes() {
    	studentscourses();
    	int i = m.getaccountnumber();
    	return studentcoursesdata.get(i).getlist(); 
    } 
    
  
    
    
    public ArrayList<String> ListofCoursesNames() {
    	codes();
    	Names();
    	studentscourses();
    	int i = m.getaccountnumber();
    	ArrayList<String> v = new ArrayList<>();
    	for (int k=0;k< studentcoursesdata.get(i).getlist().toArray().length;k++)
    	{String bn = studentcoursesdata.get(i).getlist().get(k);
    	 codesandnames(bn);
    		}
    			
    	return v; 
    } 
   
    private int number;
    private void setnumber(int n) {
	this.number= n;
    }
    private int getnumber() {
    return number;
    }

    public String codesandnames(String code) {
    	codes();
    	Names();
    	for (int k=0;k< CoursesCodes.toArray().length;k++)
    	    {if(code.equals(CoursesCodes.get(k)))
    	    	{ setnumber(k);}
    	    }
        return CoursesNames.get(getnumber());
    }



    public String Registertoanewcourse(String c) {
    	studentscourses();
    	int i = m.getaccountnumber();
    	for (int f=0;f< CoursesCodes.toArray().length;f++)
    		for (int k=0;k<= studentcoursesdata.get(i).getlist().toArray().length;k++)
    	        if ((c.equals(CoursesCodes.get(f))&& (c.equals(studentcoursesdata.get(i).getlist().get(k)))))
    	        	         return "This Course already exists";
    		    	      
    		    else if (c.equals(CoursesCodes.get(f)))
    		               {studentcoursesdata.get(i).getlist().add(c);
    		                 return "Registered Correctly";}
    	
    	       
    	                     return "Course Not Found,please Try again";
    }
    
    
    }
 
