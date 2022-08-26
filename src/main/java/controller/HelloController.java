package controller;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@Configuration
@SpringBootConfiguration
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(@RequestParam(name="name",defaultValue="World")String name) {
		return String.format("Hello, %s",name);
	}
}
