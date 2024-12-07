package EndSem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.klef.jfsd.HQL.Employee;

public class ClientDepartment {
	public static void main(String[] args) {
		ClientDepartment cd=new ClientDepartment();
		
	}
	
	public void addDepartment() {
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		Department d=new Department(1,"CSE","CBlock","Senthil");

		
		session.persist(d);
		transaction.commit();
		System.out.println("Department added sucussfully");
		session.close();
		sf.close();
	}
	

}
