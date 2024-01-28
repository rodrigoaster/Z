package org.acme.app.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefaultResponseDTO {
    private String responseMessage;
    private String responseCode;
    private String responseStatus;
}
