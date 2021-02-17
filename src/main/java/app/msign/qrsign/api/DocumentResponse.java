package app.msign.qrsign.api;

import lombok.Data;

import java.util.List;

@Data
public class DocumentResponse {
    private String documentId;
    private Boolean dynamic;
    private String filename;
    private String description;
    private Integer size;
    private String sha256;
    private String mimeType;
    private String signType;
    private List<SignDetailResponse> signDetails;
}
