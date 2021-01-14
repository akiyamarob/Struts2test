//package sample;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//
//
//
//public class Dao {
//
//    private SessionFactory sf;
//
//    public Dao() {
//        super();
//    }
//
//    public Dao(SessionFactory sf) {
//        super();
//        this.sf = sf;
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<userid> findAll() {
//        Session ss = sf.openSession();
//        return ss.createQuery("from userid").list();
//    }
//}