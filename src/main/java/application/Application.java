/**
 * 
 */
package application;

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

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

		EntityManager em = emf.createEntityManager();

		List<User> user = em.createQuery("FROM user", User.class).getResultList();

		for(User u: user) {
			System.out.println(u.toString());
		}

		em.close();
		emf.close();
	}

}