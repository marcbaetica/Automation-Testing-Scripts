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
