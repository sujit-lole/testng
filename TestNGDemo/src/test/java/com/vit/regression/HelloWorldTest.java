package com.vit.regression;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vit.regression.source.RandomEmailGenerator;

public class HelloWorldTest {
	@Test
	public void helloWorldTest() {
		System.out.println("This is hello world test case...");
	}

	@Test(invocationCount = 10)
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");

	}
}
