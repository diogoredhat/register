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
		
		Person p = new Person();
		Date d = new Date();
		Contact c = new Contact();
		
		p.setName("Teste");
		p.setCpf("37128723803");
		p.setDob(d);
		p.setSex('f');
		p.setContact(c);
		
		System.out.println(p.toString());
	}

}
