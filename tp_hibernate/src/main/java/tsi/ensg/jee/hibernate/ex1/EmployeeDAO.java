package tsi.ensg.jee.hibernate.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class EmployeeDAO {

    private SessionFactory sessionFactory = HibernateUtils.createSessionFactory();

    public EmployeeDAO(SessionFactory sessionFactory){
        Objects.requireNonNull(this.sessionFactory = sessionFactory);
    }

    public void create(String firstName, String lastName, int salary) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(new Employee(firstName, lastName, salary));
        session.getTransaction().commit();
        session.close();
    }

    public boolean delete(long id) {
        Session session = sessionFactory.openSession();
        Employee employee = this.get(id).get();
        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();
        session.close();
        return this.get(id) == null;

    }

    public boolean update(long id, int salary) {
        Session session = sessionFactory.openSession();
        Employee employee = this.get(id).get();
        employee.setSalary(salary);
        session.beginTransaction();
        session.merge(employee);
        session.getTransaction().commit();
        session.close();
        return this.get(id).get().getSalary() == salary;
    }

    public void updateSalaryByRate(long id, double rate){
        Employee employee = this.get(id).get();
        this.update(id, (int)Math.round(employee.getSalary()*(1+rate)));
    }

    public void updateLowSalary(long id, int increase, int threshold){
        Employee employee = this.get(id).get();
        int wage = employee.getSalary();
        if (wage < threshold) {
            this.update(id,wage+increase);
        }
    }

    public Optional<Employee> get(long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Employee result = (Employee)session.get(Employee.class,id);
        session.getTransaction().commit();
        session.close();
        return Optional.ofNullable(result);
    }

    public List<Employee> getAll() {
        Session session = sessionFactory.openSession();
        List<Employee> result = session.createQuery("from Employee").list();
        session.close();
        return result;
    }

}
