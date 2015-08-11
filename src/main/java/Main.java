import com.maxboguslavskyi.bookstore.config.HibernateUtils;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();


    }
}
