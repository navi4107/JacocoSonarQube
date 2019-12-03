package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JacocoSonarQubeApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class JacocoSonarQubeApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void sayHelloTest() {
		String name = testRestTemplate.getForObject("/mapping/jhjhjh", String.class);
		System.out.println(name);
		assertEquals("helloj", name);
		//https://ctl.atlassian.net/browse/AAD-17
		//https://ne1itcprhas70.ne1.savvis.net:8443/view/HYPERION/job/HYPERION_STG/ 
	}
	@Test
	public void sayHelloTest1() {
		String name = testRestTemplate.getForObject("/mapping/avinash", String.class);
		assertEquals("Hi", name);
	}

	@Test
	public void sayHelloTest2() {
		String name = testRestTemplate.getForObject("/mapping/avh", String.class);
		assertEquals("helloa", name);
	}

	@Test
	public void sayHelloTest3() {
		String name = testRestTemplate.getForObject("/mapping/rth", String.class);
		assertEquals("hellor", name);
	}

}
