package com.GithubActions.practise.restAssured;

// correct static import
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
//import org.testng.annotations.Test; 

public class GetMethodTest {
	@Test
public void getUsers() {
		
		given()//precondition
		 	.baseUri("https://restful-booker.herokuapp.com/booking")
		.when()// action
			.get()
		.then()// assertion
			.statusCode(200)
			.log().body();
		
	}
//	Added comment to this file

}
