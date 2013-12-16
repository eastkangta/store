package com.zxd.store.controller.fore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/fore")
public class IndexController {
//	private static Logger logger = g
	@RequestMapping(value="/index")
	public @ResponseBody String index(){
		System.out.println("i am in");
		return "fore/index";
	}
}
