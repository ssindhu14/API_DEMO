package Billing_Inquiry_Point_API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Billing_Inquiry_Point_TCs extends Billing_Inquiry_Point_APIs {
    RequestSpecification rspec;
    RequestSpecBuilder build;

    @BeforeTest
    public void requestSpec() {
        build = new RequestSpecBuilder();
        build.setBaseUri("https://finance-dev.magmutual.com/billing-inquiry-point-api/");
        build.addHeader("Connection", "keep-alive");
        rspec = build.build();
    }
    @Test
    void policy_activities() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","6600010")
                .queryParam("symbol","MGL")
                .queryParam("module","00")
                .queryParam("company","01")
                .queryParam("policyPeriod","06%2F01%2F2019%20-%2006%2F01%2F2025")
                .get("pointPolicyActivities?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void installment_summary() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","6600010")
                .queryParam("symbol","MGL")
                .queryParam("module","00")
                .queryParam("company","01")
                .queryParam("installmentNumber","1")
                .get("pointInstallmentSummary?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void installment_details() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","6600010")
                .queryParam("symbol","MGL")
                .queryParam("module","00")
                .queryParam("company","01")
                .queryParam("installmentNumber","2")
                .get("pointInstallmentDetails?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
    @Test
    void billing_details() {
        String responseTest = given().spec(rspec)
                .when()
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","6600010")
                .queryParam("symbol","MGL")
                .queryParam("module","00")
                .queryParam("company","01")
                .get("pointBillingDetails?/")
                .then().statusCode(200)
                .assertThat().extract().response().toString();
        System.out.println(responseTest);
    }
}
