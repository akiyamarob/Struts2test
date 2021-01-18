package seePages;
/**
 * @author r.akiyama
 * @version 1.0
 */
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * データアクセスオブジェクト。31行目でマッピングエラーが起こるため、調査中。
 *
 */
public class Dao {

    private SessionFactory sf;

    public Dao() {
        super();
    }

    public Dao(SessionFactory sf) {
        super();
        this.sf = sf;
    }

    @SuppressWarnings("unchecked")
    public List<UserId> findAll() {
        Session ss = sf.openSession();
        ss.beginTransaction();
        return ss.createQuery("from UserId").list();
    }
}