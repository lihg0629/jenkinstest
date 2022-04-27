package jenkins.test.li.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class JenkinsController {

	@GetMapping("/jenkins/hi")
	private String sayHi() {
		return "Hi jenkins";
	}
}
