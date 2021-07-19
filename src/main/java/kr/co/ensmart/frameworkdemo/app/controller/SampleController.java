package kr.co.ensmart.frameworkdemo.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/sample")
@Slf4j
public class SampleController {
	@Value("${app.name}")
	private String appName;
	
	@GetMapping("/main")
	String viewMain() {
		log.info("test: {}", appName);
		
		return "sample/main";
	}
	
}
