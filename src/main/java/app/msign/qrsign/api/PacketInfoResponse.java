package app.msign.qrsign.api;

import lombok.Data;

@Data
public class PacketInfoResponse {
    private Boolean authRequired;
    private String version;
}
