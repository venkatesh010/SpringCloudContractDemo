package com.example.providerService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@PostMapping
	public String add(@RequestBody CalculatorRequest request){
		return Integer.toString(request.getFirst()+request.getSecond());
	}
}
