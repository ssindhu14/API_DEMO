package GCP_Salesforce_User_API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class GCP_SF_User_TCs extends GCP_SF_User_APIs{
    RequestSpecification rspec;
    RequestSpecBuilder build;

    @BeforeTest
    public void requestSpec() {
        build = new RequestSpecBuilder();
        build.setBaseUri("https://website-dev.gcp.magmutual.com/gcp-salesforce-user-api/");
        build.addHeader("Connection", "keep-alive");
        build.addHeader("X-MagAPI-Version","v6");
        rspec = build.build();
    }
    @Test
    void test_check_policy_admin() {
        String response =given().spec(rspec)
                .when()
                .get("check-policy-admin/0053l00000JJYU6AAP").then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(response);
    }
    @Test
    void test_accountId1() {
        String response =given().spec(rspec)
                .when()
                .get("accountId/0053l00000JJYU6AAP").then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(response);
    }
    @Test
    void test_invoice_cloud() {
        String response =given().spec(rspec)
                .when()
                .get("check-policy-admin/0053l00000JJYU6AAP").then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(response);
    }
    @Test
    void test_accountId2() {
        String response =given().spec(rspec)
                .when()
                .get("0053l00000JJYU6AAP").then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(response);
    }
    @Test
    public void gcp_sf_user_check_policy_admin_log()throws IOException {
        Response response = createGcpSfUser();
        Assert.assertEquals(response.statusCode(),200);
    }

}
