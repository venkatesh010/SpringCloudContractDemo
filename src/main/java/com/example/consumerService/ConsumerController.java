package com.example.consumerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	private final RestTemplate template;

	ConsumerController(RestTemplate template) {
		this.template = template;
	}

	@GetMapping("/add/{first}/{second}")
	public String add(@PathVariable int first, @PathVariable int second){
		//return Integer.toString(first + second);

		//Making a post request to provider microservice
		//provider url
		//similar to stub url
		return template.postForObject("http://localhost:8081/add", new CalculatorRequest(first, second), String.class);
	}

}
