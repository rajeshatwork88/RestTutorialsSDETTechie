import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.PreemptiveAuthSpec;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class TC007_Get_Request_Authorization {

    @Test
    public void getNodeValues() {
        //Specify bas URI
        RestAssured.baseURI = "";

        //basic authentication
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("Test@gmail.com");
        authScheme.setPassword("abcd");


        RestAssured authentication=authScheme;

        //Request object
        RequestSpecification httpRequest = RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET, "/");

        //Status code verification
        int statusCode = response.getStatusCode();
        System.out.println("Status code is:"+statusCode);
        Assert.assertEquals(statusCode, 200);

        //Print response in console window
        String responseBody =response.getBody().asString();
        System.out.println("Response bod:"+responseBody);
    }

    }
