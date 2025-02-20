package at.eischer;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ExampleResourceTest {
    @Test
    void testHelloEndpoint() {
        given().queryParam("a", 1).queryParam("b", 2) //
                .when().post("/sum")//
                .then().statusCode(200).body(is("3"));
    }

}