package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletContext;

import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionSupport;
public class Login  extends ActionSupport{
	private String id;
	private String pass;
	LocalDateTime d = LocalDateTime.now();
    ServletContext context;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	private String date = d.format(formatter);
	@SuppressWarnings("unlikely-arg-type")
	public String execute() {
		SessionFactory sf = (SessionFactory) context.getAttribute(HibernateListener.KEY_NAME);
		Dao Dao = new Dao(sf);
		List<UserId> hList = Dao.findAll();
		 System.out.println(hList);
		if(hList.contains(id) &&pass.equals("pass") ) {
			return "success";
		}else {
			if(!id.equals("ID") ) {
				return "iderr";
			}else {
				return "passerr";
			}
		}
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}




}
