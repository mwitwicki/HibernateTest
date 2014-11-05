import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.hibernate.dto.User;


public class HibernateTest {

	/**
	 * Hibernate Test
	 * @param args
	 */
	public static void main(String[] args) {
		
		AnnotationConfiguration config = new AnnotationConfiguration().configure();
		SessionFactory factory = config.buildSessionFactory();
		User user = new User();
		user.setUserName("Miroslaw");
		user.setUserAge("30");
		user.setUserAdress("Zyrardow/Limanowskiego 20");
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
