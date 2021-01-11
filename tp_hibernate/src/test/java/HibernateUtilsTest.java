import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import tsi.ensg.jee.hibernate.ex1.HibernateUtils;

public class HibernateUtilsTest {

    @Test
    public void testCreateSessionFactory(){
        //arrange
        SessionFactory sessionFactory;

        //act
        sessionFactory = HibernateUtils.createSessionFactory();

        //assert
        Assert.assertNotNull(sessionFactory);
    }

}
