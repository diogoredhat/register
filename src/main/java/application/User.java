package application;

import java.util.ArrayList;
import java.util.Date;

public class User extends People{
	ArrayList <Contact> contacts = new ArrayList<Contact>();

	public User(Contact contact) {
		super();
		this.contacts.add(contact);
		
	}
	

	public User(String name, Date dob, Character sex, String cpf, Contact contact) {
		super(name, dob, sex, cpf);
		this.contacts.add(contact);
	}

	public User(String name, Date dob, Character sex, String cpf, ArrayList<Contact> contacts) {
		super(name, dob, sex, cpf);
		this.contacts = contacts;
	}

	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}


	@Override
	public String toString() {
		String user = "User: \n" + super.toString() + "]";
		user += "\nContacts: \n";
		for(int i=0; i<contacts.size(); i++) {
			user += contacts.get(i).toString() + "\n";
		}
		return user;
	}
	
	
	
}
