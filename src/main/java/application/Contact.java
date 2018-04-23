/**
 * 
 */
package application;

/**
 * @author roribeir
 *
 */
public class Contact {
	private Integer tel;
	private Integer cel;
	private String email;
	
	public Contact() {}
	
	public Contact(Integer tel, Integer cel, String email) {
		this.tel = tel;
		this.cel = cel;
		this.email = email;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		String contacts;
		contacts = "Phone: " + this.tel + "\n";
		contacts += "Cell Phone: " + this.cel + "\n";
		contacts += "Email: " + this.email;
		return contacts;
	}
}
