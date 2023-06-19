package assistance.track.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ConnectionTest {

	/**
	 * @param args
	 */
	private  SessionFactory sessionFactory = HibernateUtil.getSession();
	private  Session  session = sessionFactory.openSession();
	public static void main(String[] args) {
		ConnectionTest obj = new ConnectionTest();
		obj.test();
	}
	public  void test(){
		System.out.println("sessionFactory=========" + sessionFactory);
		System.out.println("session=========" + session);
		System.out.println("session1111=========" + session.isConnected());
	}

}
