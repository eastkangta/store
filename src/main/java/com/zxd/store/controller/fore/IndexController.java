package com.zxd.store.controller.fore;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/fore")
public class IndexController {
	
	@RequestMapping(value="/index")
	public String index(){
		return "fore/index";
	}
}
