package tsi.ensg.jee.hibernate.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EmployeeDAO {

    private SessionFactory sessionFactory = HibernateUtils.createSessionFactory();

    public EmployeeDAO(SessionFactory sessionFactory){
        Objects.requireNonNull(this.sessionFactory = sessionFactory);
    }

    public long create(String firstName, String lastName, int salary) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(new Employee("Harry", "Potter", 1000));
        session.getTransaction().commit();
        session.close();
    }

    public boolean delete(long id) {
        // TODO
    }

    public boolean update(long id, int salary) {
        //TODO
    }

    public Optional<Employee> get(long id) {
        Session session = sessionFactory.openSession();
        Employee result = session.get(Employee.class,id);
        session.close();
        return Optional.of(result);
    }

    public List<Employee> getAll() {
        Session session = sessionFactory.openSession();
        List<Employee> result = session.createQuery("from Employee").list();
        session.close();
        return result;
    }

}
