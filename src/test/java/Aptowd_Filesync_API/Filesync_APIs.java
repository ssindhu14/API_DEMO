package Aptowd_Filesync_API;

import Restutils.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class Filesync_APIs {
    public Response createFileSync(Map<String,Object> createPayload){
       String endPoint =(String) Filesync_Base.dataFromJsonFile.get("aptowd-filesync-api");
        return RestUtils.performPost(endPoint,createPayload,new HashMap<>());
    }
}
