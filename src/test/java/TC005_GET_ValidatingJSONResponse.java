import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import javax.management.relation.RelationServiceNotRegisteredException;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.SortedMap;

public class TC005_GET_ValidatingJSONResponse {

    @Test
    public void getJsonRespons(){

        //specify base URI
        RestAssured.baseURI="";

        //Request object
        RequestSpecification httpRequest =RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET, "/Delhi");
        String responseBody= response.getBody().asString();

        //Print response in console
        System.out.println("Response body is:"+responseBody);

        Assert.assertEquals(responseBody.contains("Delhi"), true);


    }
}
