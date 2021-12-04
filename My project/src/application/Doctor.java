package application;

import java.util.ArrayList;

public class Doctor extends Person {
	public ArrayList<Person> doctoraccount = new ArrayList<>();
	Person a1 = new Person();
	Person a2 = new Person();
	Person a3 = new Person();
	
	public void arrayofaccounts() {
		a1.username= "Mohamed";
		a1.password = "1225";
		doctoraccount.add(a1);
		a2.username = "Ahmed";
		a2.password = "5689";
		doctoraccount.add(a2);
		a3.username = "Asmaa";
		a3.password = "7364";
		doctoraccount.add(a3);
	}
	
	public boolean Comparinginput(String UsernameINPUT, String PasswordINPUT){
		arrayofaccounts();
		for (int i = 0; i < doctoraccount.toArray().length ; i++) {
			if((doctoraccount.get(i).username.equals(UsernameINPUT)) && (doctoraccount.get(i).password.equals(PasswordINPUT)))
			return true;	
	}
	return false;
}
	
	
	
	public void addaccount() {
		
	}
	
	public void Addcourse() {
		
	}

}
