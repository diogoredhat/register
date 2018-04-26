package application;

import java.util.Date;

public class Contact extends People{
	private String email;
	private String ddd;
	private String tel;
	private String cel;
	
	public Contact(String name, String cpf) {
		super(name, cpf);
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, Date dob, Character sex, String cpf) {
		super(name, dob, sex, cpf);
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, Date dob, Character sex, String cpf, 
			String email, String ddd, String tel, String cel) {
		super(name, dob, sex, cpf);
		this.email = email;
		this.ddd = ddd;
		this.tel = tel;
		this.cel = cel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	@Override
	public String toString() {
		String contact;
		contact = "Contact: " + super.toString();
		contact += ", email=" + email + ", tel= (" + ddd + ") " + tel + ", cel= (" + ddd + ") " + cel + "]";
		return contact;
	}

	
	
}
