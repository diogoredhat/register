/**
 * 
 */
package application;

import java.util.Date;

/**
 * @author roribeir
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Contact c = new Contact();
		User p = new User(c);
		Date d = new Date();
		
		
		p.setName("Teste");
		p.setCpf("37128723803");
		p.setDob(d);
		p.setSex('M');
		p.addContact(c);
		
		System.out.println(p.toString());
	}

}
