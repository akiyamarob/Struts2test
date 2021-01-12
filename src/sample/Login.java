package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.opensymphony.xwork2.ActionSupport;
public class Login  extends ActionSupport{
	private String id;
	private String pass;
	LocalDateTime d = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	private String date = d.format(formatter);
	public String execute() {
		if(id.equals("ID") &&pass.equals("pass") ) {
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
