import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class TC006_ExtractValuesOfEachNodeInJSON {

    @Test
    public void getNodeValues(){
        //Specify bas URI
        RestAssured.baseURI="";

        //Request object
        RequestSpecification httpRequest = RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET, "/Delhi");

        JsonPath jsonpath = response.jsonPath();

        System.out.println(jsonpath.get("City"));;

        Assert.assertEquals(jsonpath.get("City"), "Delhi");
    }
}
