package seePages;
/**
 * @author r.akiyama
 * @version 1.0
 */
import java.time.LocalDateTime;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;

public class WhatYouSee extends ActionSupport{
	String val;
	String url;
	/**
	 * 入力チェックを行うバリデーター
	 */
@Validations(requiredStrings = {
		@RequiredStringValidator(fieldName = "val",message = "一つ選択してください")
})


	/**
	 * executeメソッド
	 * 日付を取得し、Weekが6,7(土日)以外の場合、時間が9~15の間、遷移先を切り替える。
	 * 上記に当てはまらない場合、seepages()を呼び出す。
	 *@return result
	 */


	public String execute() throws Exception {

		LocalDateTime d = LocalDateTime.now();
		Integer hour = d.getHour();
		int week = d.getDayOfWeek().getValue();
		String res = "";


		switch(week) {
		case 6:
		case 7:

			res = seepages(val);

		default:
			if(hour<18 || hour>8) {
//				addActionError("現在表示できません");
//				res ="input";
				res= seepages(val);
			}else {
				res= seepages(val);
			}
		}
		return res;
		}
	/**
	 * seepagesメソッド
	 * valが1ならvalに "https://www.nicovideo.jp/my"を代入し、それ以外の場合、
	 * "https://www.youtube.com/?gl=JP"を代入する。
	 * @return seepage
	 */
	public String seepages(String val) {
		//固定のページにしか遷移できないため、選択肢をDBから取得したい。
		if(Integer.parseInt(val)==1){
		val = "https://www.nicovideo.jp/my";
		return "seepage";
		}else if(Integer.parseInt(val)==2){
			val = url;
			return "seepage";
			}else {
			val = "https://www.youtube.com/?gl=JP";
			return "seepage";
		}
	}

//Valのゲッターとセッター
	 public String getVal() {
		 return val;
		}
		public void setVal(String val) {
			this.val = val;
		}
//urlのゲッターとセッター
	 public String getUrl() {
		 return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
}
