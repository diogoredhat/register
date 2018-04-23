/**
 * 
 */
package application;

import java.util.Date;

/**
 * @author roribeir
 *
 */
public abstract class People {
	private String name;
	private Date dob;
	private Character sex;
	private String cpf;
	
	public People() {
	}
	
	public People(String name, Date dob, Character sex, String cpf) {
		this.name = name;
		this.dob = dob;
		this.sex = sex;
		this.cpf = cpf;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.toLowerCase();
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
		this.sex = Character.toLowerCase(sex);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", dob=" + dob + ", sex=" + ((sex == 'm') ? "Male": "Female") + ", cpf=" + cpf;
	}
	
	
	
}
