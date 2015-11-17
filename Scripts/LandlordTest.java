package REST.API.TEST;

import static com.jayway.restassured.RestAssured.*;
import org.junit.BeforeClass;
import static org.hamcrest.Matchers.*;
import REST.SAMPLE.MODEL.LandLord;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.junit.Test;


/* LandLord End point Test/*
*
*/


public class LandlordTest {

  @BeforeClass
  public static void init() {
    RestAssured.baseURI = "http://localhost:8080";
  }

  @Test
  public void landlardendpoint() {
    when()
      .get("/landlords")//This is Main tag for Get//
      .then()
      .statusCode(200);
      //.body("", is(empty()));
  }

  @Test
  public void postLandlor01() {
    LandLord Lord = new LandLord("Jammalah","Jammalah");
    String id = given()
      .contentType(ContentType.JSON)
      .body(Lord)
      .when()
      .post("/landlords")
      .then()
      .statusCode(201)
      .body("firstName", is(Lord.getFirstName()))
      .body("lastName", is(Lord.getLastName()))
      .body("trusted", is(false))
      .body("apartments", is(empty()))
      .extract()
      .path("id");
    given()
      .pathParam("id",id)
      .when()
      .get("/lendlords/{id}")
      .then()
      .statusCode(200)
      .body("id", is(id))
      .body("firstName", is(Lord.getFirstName()))
      .body("lastName", is(Lord.getLastName()))
      .body("trusted", is(false))
      .body("apartments", is(empty()));
  }

}
