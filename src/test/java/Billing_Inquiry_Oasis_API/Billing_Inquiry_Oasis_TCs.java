package Billing_Inquiry_Oasis_API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Billing_Inquiry_Oasis_TCs extends Billing_Inquiry_Oasis_APIs{

    RequestSpecification rspec;
    RequestSpecBuilder build;

    @BeforeTest
    public void requestSpec() {
        build = new RequestSpecBuilder();
        build.setBaseUri("https://finance-dev.magmutual.com/billing-inquiry-oasis-api/");
        build.addHeader("Connection", "keep-alive");
        rspec = build.build();
    }
    @Test
    void billing_details1() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .get("v3/billingDetails?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void billing_details2() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .queryParam("policyTermNumberId","2709140281")
                .get("v3/billingAccount?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void billing_details3() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .queryParam("startDate","2024-04-25")
                .queryParam("endDate","2024-04-25")
                .get("v2/billingDetails?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void billing_details4() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .queryParam("startDate","2024-04-25")
                .queryParam("endDate","2024-04-25")
                .get("v1/billingDetails?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void billing_account() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .queryParam("policyTermNumberId","2709140281")
                .get("v3/billingAccount?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void billing_address() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .get("v1/billingAddress?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void instalment_details1() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .queryParam("billingAccountId","G09128763")
                .queryParam("policyTermnumberId","2709140281")
                .queryParam("instalmentNumber","1")
                .get("v2/viewInstalmentDetails?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void instalment_details2() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .queryParam("billingAccountId","G09128763")
                .queryParam("policyTermnumberId","2709140281")
                .queryParam("instalmentNumber","1")
                .get("v1/viewInstalmentDetails?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void instalment_summary1() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .queryParam("billingAccountId","G09128763")
                .queryParam("policyTermnumberId","2709140281")
                .get("v2/viewInstalmentsummary?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void instalment_summary2() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .queryParam("billingAccountId","G09128763")
                .queryParam("policyTermnumberId","2709140281")
                .queryParam("instalmentNumber","1")
                .get("v1/viewInstalmentsummary?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    public void billing_details_log()throws IOException {
        Response response = createBillingInquiryOasis();
        Assert.assertEquals(response.statusCode(),200);
    }
}
