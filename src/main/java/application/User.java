package application;

import java.util.ArrayList;
import java.util.Date;

public class User extends People{
	ArrayList <Contact> contacts;

	public User() {
		super();
	}
	

	public User(String name, Date dob, Character sex, String cpf) {
		super(name, dob, sex, cpf);
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
		String user = "User " + super.toString();
		user += ", contacts [";
		for (Contact c: contacts) {
			user += c.toString();
		}
		user += "]]";
		return user;
	}
	
	
	
}
