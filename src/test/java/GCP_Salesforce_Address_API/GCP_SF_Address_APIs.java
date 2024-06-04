package GCP_Salesforce_Address_API;

import Aptowd_Filesync_API.Filesync_Base;
import Restutils.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class GCP_SF_Address_APIs {
    public Response createGcpSfAddressContact(){
        String endPoint =(String)GCP_SF_Address_Base.dataFromJsonFile.get("gcp_address");
        System.out.println(endPoint);
        return RestUtils.performGetGcpAddress(endPoint,new HashMap<>());
    }
}
