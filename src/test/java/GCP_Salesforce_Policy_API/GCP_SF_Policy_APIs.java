package GCP_Salesforce_Policy_API;

import GCP_Salesforce_Address_API.GCP_SF_Address_Base;
import Restutils.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;

public class GCP_SF_Policy_APIs {
    public Response createGcpSfPolicyAccount(){
        String endPoint =(String) GCP_SF_Policy_Base.dataFromJsonFile.get("gcp_policy");
        System.out.println(endPoint);
        return RestUtils.performGetGcpPolicy(endPoint,new HashMap<>());
    }
}
