package seePages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	/** ロガー */
	private Logger logger = LogManager.getLogger(HelloWorldAction.class);

	/** 名前 */
	private String name;

	public String execute() {
		if (name.equals("ERR")) {
			return "err";
		} else if (name.equals("RDR")) {
			return "rdr";
		} else {
			logger.info("入力されたパラメータは「{}」です。", name);
			return "success";
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}