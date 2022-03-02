import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class Demo4_Get_Request_PrintAllHeaders {

@Test
    public void getWeatherDetails(){
        //Specify base URI
        RestAssured.baseURI="";

        //Request object
       RequestSpecification httpRequest =  RestAssured.given();


       //Response object
       Response response =  httpRequest.request(Method.GET, "");

       //Print response in console window
        String responseBody = response.body().asString();
        System.out.println("Response body:"+responseBody);

       /* //Validating headers
        String contentType = response.header("Content-Type"); //Capture details of content-type header
        System.out.println("Content type is"+contentType);
        Assert.assertEquals(contentType, "application/xml; charset=UTF-8");

        String contentEncoding = response.header("Content-Encoding");//Capture details of content-encoding
        System.out.println("Content encoding is"+contentEncoding);
        Assert.assertEquals(contentEncoding, "gzip");*/

    Headers allHeaders = response.headers();

    for(Header header : allHeaders ){
        System.out.println(header.getName()+" "+header.getValue());

    }

    }
}
