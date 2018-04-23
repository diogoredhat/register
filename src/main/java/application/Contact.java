package application;

import java.util.Date;

public class Contact extends People{
	private String email;
	private Integer ddd;
	private Integer tel;
	private Integer cel;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, Date dob, Character sex, String cpf) {
		super(name, dob, sex, cpf);
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, Date dob, Character sex, String cpf, 
			String email, Integer ddd, Integer tel, Integer cel) {
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

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public Integer getCel() {
		return cel;
	}

	public void setCel(Integer cel) {
		this.cel = cel;
	}

	@Override
	public String toString() {
		String contact;
		contact = "Contact " + super.toString();
		contact += ", email=" + email + ", ddd=" + ddd + ", tel=" + tel + ", cel=" + cel + "]";
		return contact;
	}

	
	
}
