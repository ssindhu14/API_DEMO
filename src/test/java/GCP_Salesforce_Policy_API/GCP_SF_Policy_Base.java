package GCP_Salesforce_Policy_API;

import Utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class GCP_SF_Policy_Base {
    public static Map<String,Object> dataFromJsonFile;
    static {
        try {
            dataFromJsonFile= JsonUtils.getJsonDataAsMap("JsonFiles/gcp.dev.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
