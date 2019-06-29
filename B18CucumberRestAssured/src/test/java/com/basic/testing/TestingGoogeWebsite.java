package com.basic.testing;


import org.junit.Assert;
import org.junit.Test;

//import org.testng.Assert;
//import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestingGoogeWebsite {
	
//	public static void main(String args[]){
//		
//		Response res = RestAssured.given().get("https://www.google.com");
//		int statCode = res.statusCode();
//		System.out.println("Status code = " + statCode);
//	}
	
	@Test
	public void testGoogle(){
		Response res = RestAssured.given().get("https://www.google.com");
		int statCode = res.statusCode();
		System.out.println("Status code = " + statCode);
		Assert.assertEquals(200, statCode);
	}
}
