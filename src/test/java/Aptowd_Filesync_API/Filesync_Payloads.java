package Aptowd_Filesync_API;

import java.util.HashMap;
import java.util.Map;

public class Filesync_Payloads {

    public static String getSyncPayLoadStringFile(String transactionRequestId, String adhocPaymentReferenceID, String status, String company, String checkNumber,
                                        String adhocPayee, String paymentType, String settlementRunDate, String paymentDate, String externalReference, String checkVoidDate,
                                        String bankAccount, String paymentAmount, String lastUpdateTimestamp, String paymentReferenceID) {
        String payload = "{\n" +
                " \"transactionRequestId\": " + transactionRequestId + ",\n" +
                "\"adhocPaymentReferenceID\": " + adhocPaymentReferenceID + ",\n" +
                "\"status\": " + status + ",\n" +
                "\"company\":" + company + ",\n" +
                "\"checkNumber\": " + checkNumber + ",\n" +
                "\"adhocPayee\": " + adhocPayee + ",\n" +
                "\"paymentType\": " + paymentType + ",\n" +
                "\"settlementRunDate\": " + settlementRunDate + ",\n" +
                "\"paymentDate\": " + paymentDate + ",\n" +
                "\"externalReference\": " + externalReference + ",\n" +
                "\"checkVoidDate\": " + checkVoidDate + ",\n" +
                "\"bankAccount\": " + bankAccount + ",\n" +
                "\"paymentAmount\": " + paymentAmount + ",\n" +
                "\"lastUpdateTimestamp\": " + lastUpdateTimestamp + ",\n" +
                "\"paymentReferenceID\": " + paymentReferenceID + ",\n" +
                "}";
        return payload;
    }
    public static Map<String,Object> getSyncPayLoadMapFile(String transactionRequestId, String adhocPaymentReferenceID, String status, String company, String checkNumber,
                                                       String adhocPayee, String paymentType, String settlementRunDate, String paymentDate, String externalReference, String checkVoidDate,
                                                       String bankAccount, String paymentAmount, String lastUpdateTimestamp, String paymentReferenceID) {
        Map<String,Object> payload = new HashMap<>();
        payload.put("transactionRequestId",transactionRequestId);
        payload.put("adhocPaymentReferenceID",adhocPaymentReferenceID);
        payload.put("status",status);
        payload.put("company",company);
        payload.put("checkNumber",checkNumber);
        payload.put("adhocPayee",adhocPayee);
        payload.put("paymentType",paymentType);
        payload.put("settlementRunDate",settlementRunDate);
        payload.put("paymentDate",paymentDate);
        payload.put("externalReference",externalReference);
        payload.put("checkVoidDate",checkVoidDate);
        payload.put("bankAccount",bankAccount);
        payload.put("paymentAmount",paymentAmount);
        payload.put("lastUpdateTimestamp",lastUpdateTimestamp);
        payload.put("paymentReferenceID",paymentReferenceID);
        return payload;
    }

}
