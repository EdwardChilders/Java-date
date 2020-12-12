package com.edward.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping("/time")
	public String index(HttpSession session, Model model) {
		Object time = new java.util.Date();
		String strDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate= dateFormat.format(time);
        session.setAttribute("time", formattedDate);
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(HttpSession sess, Model model) {
		Object date = new java.util.Date();
		String strDateFormat = "EEEE, dd MMMM yyyy";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate= dateFormat.format(date);
        sess.setAttribute("date", formattedDate);
		return "date.jsp";
	}
	
}
