import com.maxboguslavskyi.bookstore.config.HibernateConfig;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();


    }
}
