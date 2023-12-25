package com.Qacart;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestRest {

    @Test
    public void test() {
//        given().baseUri("https://658405254d1ee97c6bcec9a2.mockapi.io/api/v1")
//                .when().get("users").
//                then().log().all().assertThat().
//                statusCode(200).
//                assertThat().body("[0].name", is(equalTo("Priscilla Hauck")))
//                .assertThat().body("name", is(containsInAnyOrder("Don Schoen", "Patty Goldner", "Priscilla Hauck"))).
//                assertThat().body("name", is(not(empty())
//                )).
//                assertThat().body("name",is(hasSize(3))).
//                assertThat().body("createdAt",everyItem(is(startsWith("2023"))))
//                .assertThat().body("[0]",is(hasKey("country")))
//                .assertThat().body("[0]",is(hasValue("Burkina Faso")))
//                .assertThat().body("[0]",is(hasEntry("country","Burkina Faso")));
        String res = given().baseUri("https://658405254d1ee97c6bcec9a2.mockapi.io/api/v1").when()
                .get("users")
                .then()
                .extract()
                .response().path("[0].name");
//       String name = JsonPath.from(res.asString()).getString("[0].name");
        System.out.println(res);
    }
}
