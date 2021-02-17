package app.msign.qrsign.api;

import lombok.Data;

@Data
public class SignedDocumentResponse {
    private String documentId;
    private String signatureId;
}
