package application;

import java.util.ArrayList;

public class TeachingAssistant extends Person{
	
	public ArrayList<Person> assistantaccount = new ArrayList<>();
	Person a1 = new Person();
	Person a2 = new Person();
	Person a3 = new Person();
	
	public void arrayofusernames() {
		a1.username= "Mohamed";
		a1.password = "1225";
		assistantaccount.add(a1);
		a2.username = "Ahmed";
		a2.password = "5689";
		assistantaccount.add(a2);
		a3.username = "Asmaa";
		a3.password = "7364";
		assistantaccount.add(a3);
	}
	
	public boolean Comparinginput(String UsernameINPUT, String PasswordINPUT){
		arrayofusernames();
		for (int i = 0; i < assistantaccount.toArray().length ; i++) {
			if((assistantaccount.get(i).username.equals(UsernameINPUT)) && (assistantaccount.get(i).password.equals(PasswordINPUT)))
			return true;	
	}
	return false;
}
	
	public void addaccount() {
		
	}
}
