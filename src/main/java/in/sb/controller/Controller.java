package in.sb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private static final Logger logger = LoggerFactory.getLogger(Controller.class);
	
	
	@GetMapping("/show")
	public String show() {
		
		logger.info("Show Method Started");
		logger.info("Show Method Test");
		logger.info("Show Method Spring boot");
		logger.info("Show Method Java");
			return "Hello Logger";
	}
	
	
	@GetMapping("/Last")
	public String Last() {
		
		logger.info("Show Method Started");
		logger.info("Show Method Test");
		logger.info("Show Method Spring boot");
		logger.info("Show Method Java");
			return "Hello Nitin Thokal";
	}
	
	
	@GetMapping("/name")
	public String name() {
		
		logger.info("Show Method Started");
		logger.info("Show Method Test");
		logger.info("Show Method Spring boot");
		logger.info("Show Method Java");
			return "Hello Nitin";
	}
	
	
}
