package GCP_Salesforce_Policy_API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;
public class GCP_SF_Policy_TCs extends GCP_SF_Policy_APIs{
    RequestSpecification rspec;
    RequestSpecBuilder build;

    @BeforeTest
    public void requestSpec() {
        build = new RequestSpecBuilder();
        build.setBaseUri("https://website-dev.gcp.magmutual.com");
        build.setBasePath("v4/policies");
        build.addHeader("Connection", "keep-alive");
        build.addHeader("X-MagAPI-Version", "v4");
        rspec = build.build();
    }
    @Test
    void test_contact() {
        String response =given().spec(rspec)
                .when()
                .get("contact/003A000001T3k06IAB").then().statusCode(200)
                .assertThat().extract().response().toString();
               System.out.println(response);
    }
    @Test
    void test_psl() {
        String response =given().spec(rspec)
                .when()
                .get("PSL/1800673A").then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(response);
    }
    @Test
    void test_sfdc() {
        String response =given().spec(rspec)
                .when()
                .get("sfdc/a0D3l00000VD99UEAT").then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(response);
    }
    @Test
    void test_account() {
        String response =given().spec(rspec)
                .when()
                .get("account/001A0000018DXFfIAO").then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(response);
    }
    @Test
    public void gcp_sf_policy_account_log()throws IOException {
        Response response = createGcpSfPolicyAccount();
        Assert.assertEquals(response.statusCode(),200);
    }



}
