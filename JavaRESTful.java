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

public static void init()

{

RestAssured.baseURI = "http://localhost:8080";

}

@Test

public void landlardendpoint()

{

when()

.get("/landlords")//This is Main tag for Get//

.then()

.statusCode(200);

//.body("", is(empty()));

}

@Test

public void postLandlor01()

{

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

public class JavaRESTful {

  @Test
  public void postlandlord(){
    RestAssured.baseURI="http://10.13.72.91:8080";
    landlords ll = new landlords("test","test");
    System.out.println("ddsfsf"+ll.getFirstname());
    try{
      given()
        .contentType(ContentType.JSON)
        .body(ll)
        .when()
        .post("/landlords").
      then()
        .statusCode(201)
        .body("firstname", is(ll.getFirstname()))
        .body("lastname", is(ll.getLastName()))
        .body("Trusted", is(false))
        .body("appartments", is(empty()));
    }catch(Exception e){
      e.printStackTrace();
    }
  } //NOTE: need to fix 'java.lang.AssertionError: Expected status code <201> doesn't match actual status code <400>.'

}
