package Aptowd_Filesync_API;

import Utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class Filesync_Base {

    public static Map<String,Object> dataFromJsonFile;
    static {
        try {
            dataFromJsonFile= JsonUtils.getJsonDataAsMap("JsonFiles/fs.uat.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
