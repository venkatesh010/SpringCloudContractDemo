package com.example.providerService;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class MvcTest {
	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(new ProviderController());
	}
}
