package sample;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateListener implements ServletContextListener {
    private SessionFactory sessionFactory;

    public static final String KEY_NAME = HibernateListener.class.getName();

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        try {
            //configures settings from hibernate.cfg.xml
            Configuration configuration = new Configuration().configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties());
            SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

            //save the Hibernate session factory into serlvet context
            arg0.getServletContext().setAttribute(KEY_NAME, sessionFactory);

            //ログの出力
            if (sessionFactory != null) {
                System.out.println("セッションファクトリーを取得できました！");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}