package com.meetical.viewcontoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeeticalController {

	@RequestMapping("/meetings")
	public String getMeetings()
	{
		return "meetings";
	}

}
