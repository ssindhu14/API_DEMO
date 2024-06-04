package GCP_Salesforce_Address_API;

import Aptowd_Filesync_API.Filesync_Payloads;
import Restutils.RestUtils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GCP_SF_Address_TCs extends GCP_SF_Address_APIs {
    RequestSpecification rspec;
    RequestSpecBuilder build;

    @BeforeTest
    public void requestSpec() {
        build = new RequestSpecBuilder();
        build.setBaseUri("https://website-dev.gcp.magmutual.com");
        build.setBasePath("/gcp-salesforce-address-api/");
        build.addHeader("Connection", "keep-alive");
        build.addHeader("X-MagAPI-Version", "v4");
        rspec = build.build();
    }
    @Test
    void test_contact() {
        String responseTest = given().spec(rspec)
                .when()
                .get("contact/0033l00002VgpoAAAR/").then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }

    @Test
    void test() {
        String response =   given().spec(rspec)
                .when()
                .get("a0q3l00000BlNRdAAN").then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(response);
    }

    @Test
    public void gcp_sf_address_account_log()throws IOException {
        Response response = createGcpSfAddressContact();
        Assert.assertEquals(response.statusCode(),200);
    }

}





