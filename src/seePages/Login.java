package seePages;
/**
 * @author r.akiyama
 * @version 1.0
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class Login  extends ActionSupport implements ServletContextAware{
	private String id;
	private String pass;
	LocalDateTime d = LocalDateTime.now();
    ServletContext context;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	private String date = d.format(formatter);
	/**
	 * DBからID,パスワードを取得し、結果を返す。
	 * 現在、DB周りでのエラーを調査中。
	 * @return result
	 *
	 */
	public String execute() {
		if(idChk(id)&&passChk(pass)) {
			return "success";
		}else {
			if(!idChk(id) ) {
				  addActionError("IDが間違っています");
				  return "input";
			}else {
				addActionError("パスワードが間違っています");
				 return "input";
			}
		}
	}



	/**
	 * 入力チェックを行うバリデーター
	 */
	public void validate() {
	       if ( id == null || id.length() == 0 ) {
	            addActionError("IDを入力してください");
	        }
	       if ( pass == null || pass.length() == 0 ) {
	            addActionError("パスワードを入力してください");
	        }

	       if (numChk(pass) ) {
	            addActionError("パスワードが規則と一致しません");
	        }
	}
	/**
	 * numChk
	 * 入力値がすべて番号の場合、true、それ以外の場合、Falseを返す。
	 * @return boolean
	 */

	public boolean numChk(String wrd) {
	       String regex_num = "^[0-9]+$" ;
	       Pattern p1 = Pattern.compile(regex_num);
	       Matcher m1 = p1.matcher(wrd);
	       boolean result = m1.matches();
	       return result;
	}

	/**
	 * idChk
	 * idが指定条件の場合、true、それ以外の場合falseを返す。
	 * DBアクセスを想定して外部化
	 * @return boolean
	 */
	public boolean idChk(String id) {
		boolean result=false;
		if(id.equals("id") ) {
			result = true;
		}
		return result;
	}
	/**
	 * passChk
	 * passが指定条件の場合、true、それ以外の場合falseを返す。
	 * DBアクセスを想定して外部化
	 * @return boolean
	 */
	public boolean passChk(String pass) {
		boolean result=false;
		if(pass.equals("pass") ) {
			result = true;
		}
		return result;
	}
	/**
	 * ゲッターとセッター
	 *
	 */
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
	@Override
    public void setServletContext(ServletContext context) {
        this.context = context;
	}




}
