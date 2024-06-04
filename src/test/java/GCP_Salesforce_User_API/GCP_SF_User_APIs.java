package GCP_Salesforce_User_API;

import GCP_Salesforce_Policy_API.GCP_SF_Policy_Base;
import Restutils.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;

public class GCP_SF_User_APIs {
    public Response createGcpSfUser(){
        String endPoint =(String) GCP_SF_User_Base.dataFromJsonFile.get("gcp_user");
        System.out.println(endPoint);
        return RestUtils.performGetGcpUser(endPoint,new HashMap<>());
    }
}
