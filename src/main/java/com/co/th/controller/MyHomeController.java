package com.co.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyHomeController {
 @RequestMapping(value ="/",method = RequestMethod.GET)
 public String myHome () {
	 return "";
 }
}
