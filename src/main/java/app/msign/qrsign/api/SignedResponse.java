package app.msign.qrsign.api;

import lombok.Data;

@Data
public class SignedResponse {
    private String documentId;
    private String signatureId;
}
