package Billing_Inquiry_Point_API;

import Billing_Inquiry_Oasis_API.Billing_Inquiry_Oasis_Base;
import Restutils.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;

public class Billing_Inquiry_Point_APIs {
    public Response createBillingInquiryPoint(){
        String endPoint =(String) Billing_Inquiry_Oasis_Base.dataFromJsonFile.get("bip");
        System.out.println(endPoint);
        return RestUtils.performGetBillingPoint(endPoint,new HashMap<>());
    }
}
