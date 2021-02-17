package app.msign.qrsign.api;

import lombok.Data;

import java.util.List;

@Data
public class SignedDocumentsRequest {
    private List<SignedDocumentRequest> signedDocuments;
}
