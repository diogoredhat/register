/**
 * 
 */
package application;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
		
		//System.out.println(p.toString());
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		
		EntityManager em = emf.createEntityManager();
		
		List<User> user = em.createQuery("FROM user", User.class).getResultList();
		
		for(User u: user) {
			System.out.println(u.toString());
		}
		
		
		em.getTransaction();
		em.persist(p);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}