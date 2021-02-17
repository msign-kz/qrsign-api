package app.msign.qrsign.api;

import lombok.Data;

@Data
public class SignedDocumentRequest {
    private String documentId;
    private String signature;
}
