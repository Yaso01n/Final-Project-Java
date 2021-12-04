package application;

import java.util.ArrayList;

public class Student extends Person {
	// TODO Auto-generated constructor stub
	public Student(){		
	}
	//setter and getter of account number
	public void Setaccountnumber(int n) {
		this.accountnumber =n;
	}
	public int getaccountnumber() {
		return accountnumber;
	}
	
	
	
	public ArrayList<Person> studentaccount = new ArrayList<>();
	Person a1 = new Person();
	Person a2 = new Person();
	Person a3 = new Person();
	
	public void StudentsData() {
		a1.username= "Mohamed";
		a1.password = "1225";
		studentaccount.add(a1);
		a2.username = "Ahmed";
		a2.password = "5689";
		studentaccount.add(a2);
		a3.username = "Asmaa";
		a3.password = "7364";
		studentaccount.add(a3);
	}
	
	
	public boolean Comparinginput(String UsernameINPUT, String PasswordINPUT){
		StudentsData();
		for (int i = 0; i < studentaccount.toArray().length ; i++) {
			if((studentaccount.get(i).username.equals(UsernameINPUT)) && (studentaccount.get(i).password.equals(PasswordINPUT)))
			{
				Setaccountnumber(i);
				return true;
			}	
	        }
	           return false;
}
	
	
	public void addaccount() {
		
	}
	

	
	
    
}
