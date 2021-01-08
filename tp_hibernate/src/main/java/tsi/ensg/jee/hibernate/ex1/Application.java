package tsi.ensg.jee.hibernate.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.createSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Employee("Harry", "Potter", 1000));
        session.getTransaction().commit();
        session.close();

        System.out.println("Hello world !");
    }

}
