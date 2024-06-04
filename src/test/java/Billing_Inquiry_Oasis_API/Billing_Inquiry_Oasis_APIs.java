package Billing_Inquiry_Oasis_API;

import GCP_Salesforce_Address_API.GCP_SF_Address_Base;
import Restutils.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;

public class Billing_Inquiry_Oasis_APIs {
    public Response createBillingInquiryOasis(){
        String endPoint =(String) Billing_Inquiry_Oasis_Base.dataFromJsonFile.get("bio");
        System.out.println(endPoint);
        return RestUtils.performGetBillingPoint(endPoint,new HashMap<>());
    }
}
