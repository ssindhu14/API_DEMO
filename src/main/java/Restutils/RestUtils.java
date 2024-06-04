package Restutils;


import Reporting.ExtentReporting;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

import java.util.Map;

public class RestUtils {

    private static RequestSpecification getRequestSpecificationPost(String endPoint, Object requestPayload, Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(requestPayload);
    }

    private static RequestSpecification getRequestSpecificationGetGcpAddress(String endPoint,Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .headers(headers)
                .basePath("account/001A000001OW4RlIAL/")
                .header("X-MagAPI-Version","v4")
                .contentType(ContentType.JSON);
    }

    private static RequestSpecification getRequestSpecificationGetBillingOasis(String endPoint,Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","09128763")
                .headers(headers)
                .contentType(ContentType.JSON);
    }
    private static RequestSpecification getRequestSpecificationGetBillingPoint(String endPoint,Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .auth().basic("developermagservice","afe6rzEyzLb3UGEL")
                .queryParam("policyNumber","6600010")
                .queryParam("policyNumber","6600010")
                .queryParam("symbol","MGL")
                .queryParam("module","00")
                .queryParam("company","01")
                .queryParam("policyPeriod","06%2F01%2F2019%20-%2006%2F01%2F2025")
                .headers(headers)
                .contentType(ContentType.JSON);
    }

    private static RequestSpecification getRequestSpecificationGetGcpPolicy(String endPoint,Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .headers(headers)
                .basePath("PSL/1205679")
                .contentType(ContentType.JSON);
    }
    private static RequestSpecification getRequestSpecificationGetGcpUser(String endPoint,Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .headers(headers)
                .basePath("check-policy-admin/0053l00000JJYU6AAP")
                .contentType(ContentType.JSON);
    }

    private static void printRequestLogInReport(RequestSpecification requestSpecification) {
        QueryableRequestSpecification queryableRequestSpecification = SpecificationQuerier.query(requestSpecification);
        ExtentReporting.logInfoDetails("Endpoint is " + queryableRequestSpecification.getBaseUri());
        ExtentReporting.logInfoDetails("Method is " + queryableRequestSpecification.getMethod());
        ExtentReporting.logInfoDetails("Headers are " + queryableRequestSpecification.getHeaders().asList().toString());
        ExtentReporting.logInfoDetails("Request body is " + queryableRequestSpecification.getBaseUri());

    }

    private static void printResponseLogInReport(Response response) {
        ExtentReporting.logInfoDetails("Response status is " + response.getStatusCode());
        ExtentReporting.logInfoDetails("Response Headers are " + response.getHeaders().asList().toString());
        ExtentReporting.logInfoDetails("Response body is " + response.getBody());
        ExtentReporting.logJson(response.getBody().prettyPrint());
    }

    public static Response performPost(String endPoint, Map<String, Object> requestPayload, Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationPost(endPoint, requestPayload, headers);
        Response response = requestSpecification.post();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }

    public static Response performPost(String endPoint, String requestPayload, Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationPost(endPoint, requestPayload, headers);
        Response response = requestSpecification.post();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }

    public static Response performGetGcpAddress(String endPoint,Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationGetGcpAddress(endPoint,headers);
        Response response = requestSpecification.get();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }
    public static Response performGetBillingOasis(String endPoint,Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationGetBillingOasis(endPoint,headers);
        Response response = requestSpecification.get();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }
    public static Response performGetBillingPoint(String endPoint,Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationGetBillingPoint(endPoint,headers);
        Response response = requestSpecification.get();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }
    public static Response performGetGcpPolicy(String endPoint,Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationGetGcpPolicy(endPoint,headers);
        Response response = requestSpecification.get();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }
    public static Response performGetGcpUser(String endPoint,Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationGetGcpUser(endPoint,headers);
        Response response = requestSpecification.get();
        printRequestLogInReport(requestSpecification);
        printResponseLogInReport(response);
        return response;
    }
 }





