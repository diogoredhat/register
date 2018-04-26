package application;

import java.util.ArrayList;
import java.util.Date;

public class User extends People{
	ArrayList <Contact> contacts = new ArrayList<Contact>();

	public User(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public User(String name, String cpf, Contact contact) {
		super(name, cpf);
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
		String user = "User: \n";
		int space = super.toString().indexOf(',');
		user += super.toString().substring(6, space);
		user += ": [" + super.toString().substring(space+2) + "]";
		user += "\nContacts: \n";
		for(int i=0; i<contacts.size(); i++) {
			user += contacts.get(i).toString() + "\n";
		}
		return user;
	}	
	
	
}
