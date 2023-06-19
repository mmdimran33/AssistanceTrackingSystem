package assistance.track.util;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprication")
public class HibernateUtil {
private static final SessionFactory sessionFactory ;
static{
	try {
		File file=new File(new File("").getCanonicalPath().concat("/src/assistance/track/util/hibernate.cfg.xml"));
		sessionFactory = new AnnotationConfiguration().configure(file).buildSessionFactory();
	} catch (Throwable e) {
		throw new ExceptionInInitializerError(e);
	}
}
public static SessionFactory getSession(){
	return sessionFactory;
}
}
