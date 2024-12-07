package EndSem;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.klef.jfsd.HQL.Employee;
import com.klef.jfsd.HibernateProject.HibernateUtil;

public class DepartmentHQL {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		System.out.println(sf);
		Session session=sf.openSession();

		org.hibernate.query.Query<Department> q=session.createQuery("Delete from Department as d where d.did = :id");
		q.setParameter("id", "1");
		List<Department> dptlist=q.list();
		
		//populate the emp details on console
		for(Department d: dptlist) {
			System.out.println(d);
		}
		
		
	}

}
