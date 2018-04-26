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
		
		Contact c = new Contact("Contact Name Test", "11122233344");
		Date d = new Date();
		User p = new User("User Name Test", d, 'M', "55566677788", c);		
		
		p.addContact(c);
		
		System.out.println(p.toString());
	}

}
