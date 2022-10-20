package kr.co.ensmart.frameworkdemo.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/sample")
@Slf4j
public class SampleController {
	@Value("${app.name}")
	private String appName;
	
	@GetMapping("/main")
	String viewMain(Model model) {
		log.info("test: {}", appName);
		
		String xssTest = "<script></script>";
		model.addAttribute("xssTest", xssTest);
		
		return "sample/main";
	}

	@GetMapping("/longRunning")
	@Async
	@ResponseBody
	void longRunning() {
	    for (int i = 0; i < 100; i++) {
	        log.info("count i: {}", i);
	        try {
                Thread.sleep(1000L * 5); // 5초 대기
            } catch (InterruptedException e) {
                // do nothing
            } 
	    }
	}
	
}
