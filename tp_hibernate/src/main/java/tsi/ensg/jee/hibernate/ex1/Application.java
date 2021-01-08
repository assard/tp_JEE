package tsi.ensg.jee.hibernate.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.createSessionFactory();
        EmployeeDAO employeeDAO = new EmployeeDAO(sessionFactory);

        employeeDAO.create("Bob", "Moran", 500);
        employeeDAO.create("Lisa", "Simpson", 100);
        employeeDAO.create("Marge", "Simpson", 1000);
        employeeDAO.create("Bob", "Dylan", 600);
        employeeDAO.create("Homer", "Simpson", 450);

        System.out.println("Hello world !");
    }

}
