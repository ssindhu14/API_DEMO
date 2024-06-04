package Aptowd_Filesync_API;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class Filesync_API_TCs extends Filesync_APIs {

    @Test
    public void sync()throws IOException {
        Map<String,Object> payLoad = Filesync_Payloads.getSyncPayLoadMapFile("19586829-d122-44c8-af2d-3aa87d0078d2", "FX661893362","Canceled","MMIC MAG Mutual Insurance Co","9011813",
              "Piedmont Healthcare, PA", "Check","2020-08-12", "2020-08-12","AP:DELPHI:REFUNDS:FX661893362:1700418","2020-10-21",
                "Policy Adm", "22642","2020-10-21T08:42:57.775-07:00","9011813");
        Response response = createFileSync(payLoad);
        Assert.assertEquals(response.statusCode(),200);

    }
}