package com.jw.rs.demo.it;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jw.rs.demo.application.DemoApplication;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.given;

/**
 * Integration test of Resource DemoResource.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { DemoApplication.class })
@IntegrationTest(value = "server.port=8080")
@WebAppConfiguration
public class DemoResourceIT {

    @Value(value = "${server.port:8080}")
    private int port;

    @Before
    public void setup() throws Exception {
        RestAssured.port = port;
    }

    /**
     * Test method {@link com.jw.rs.demo.api.DemoResource#getDemoData(Integer)}.
     */
    @Test
    public void testGetDemoData() {
        given().body("").with().contentType(ContentType.JSON).then().expect().statusCode(HttpStatus.SC_OK)
                .and().body(Matchers.any(String.class)).when().get("/api/demo/data/1");
    }

    /**
     * Test method {@link com.jw.rs.demo.api.DemoResource#getDemoData(Integer)}.
     */
    @Test
    public void testGetDemoDataNotFound() {
        given().body("").with().contentType(ContentType.JSON).then().expect().statusCode(HttpStatus.SC_BAD_REQUEST)
                .and().body(Matchers.any(String.class)).when().get("/api/demo/data/1000");
    }

}
