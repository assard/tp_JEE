package tsi.ensg.jee.hibernate.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.createSessionFactory();
        EmployeeDAO employeeDAO = new EmployeeDAO(sessionFactory);

        //Create the employees
        employeeDAO.create("Bob", "Moran", 500);
        employeeDAO.create("Lisa", "Simpson", 100);
        employeeDAO.create("Marge", "Simpson", 1000);
        employeeDAO.create("Bob", "Dylan", 600);
        employeeDAO.create("Homer", "Simpson", 450);

        //Remove Lisa Simpson
        employeeDAO.delete(2);

        //Increase Homer wages
        employeeDAO.update(5,employeeDAO.get(5).get().getSalary()+100);

        //Get and show employees
        List<Employee> workforce = employeeDAO.getAll();
        for (Employee employee : workforce) {
            System.out.println(employee.toString());
        }

        //Increase by 10% Homer's wage
        employeeDAO.updateSalaryByRate(5,0.1);
        System.out.println(employeeDAO.get(5).get().toString());

        //Increase 100 the wage of employees which have less than 1000;
        for (Employee employee : workforce) {
            employeeDAO.updateLowSalary(employee.getId(), 100,1000);
        }

    }

}
