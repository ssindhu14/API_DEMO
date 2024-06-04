package Billing_Inquiry_Point_API;

import Utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class Billing_Inquiry_Point_Base {
    public static Map<String,Object> dataFromJsonFile;
    static {
        try {
            dataFromJsonFile= JsonUtils.getJsonDataAsMap("JsonFiles/bi.dev.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
