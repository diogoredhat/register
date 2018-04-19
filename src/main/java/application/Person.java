/**
 * 
 */
package application;

import java.util.Date;

/**
 * @author roribeir
 *
 */
public class Person {
	private String name;
	private Date dob;
	private Character sex;
	private String cpf;
	private Contact contact;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getContact() {
		return contact.toString();
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public String toString() {
		String person;
		person = "Name: " + this.name + "\n";
		person += "Date of Birthday: " + this.dob + "\n";
		person += "CPF: " + this.cpf + "\n";
		person += "Sex: " + ((sex.compareTo('m') == 0)? "Male" : "Female") + "\n";
		person += "Contacs: \n" + this.contact.toString();
		return person;
	}
	
}
