package sample;

import java.time.LocalDateTime;

public class WhatYouSee {
	String val;
	String Url;

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
				res ="timeout";
			}
		}
		return res;
		}

	public String seepages(String val) {
		if(Integer.parseInt(val)==1){
		val = "https://www.nicovideo.jp/my";
		return "seepage";
		}else {
			val = "https://www.youtube.com/?gl=JP";
			return "seepage";
		}
	}

	 public String getVal() {
		 return val;
		}
		public void setVal(String val) {
			this.val = val;
		}
}
