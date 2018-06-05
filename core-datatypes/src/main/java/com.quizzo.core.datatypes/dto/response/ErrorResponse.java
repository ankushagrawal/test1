package com.quizzo.core.datatypes.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.quizzo.core.datatypes.enumInterfaces.Errors;
import com.quizzo.core.datatypes.exception.ServiceException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResponse {

    private int errorStatusCode;
    private int errorInternalStatusCode;
    private String errorReasonCode;
    private String errorDescription;
    private Map<String, Object> additionalData;


    public ErrorResponse(ServiceException se) {
        this.errorStatusCode = se.getErrorStatusCode();
        this.errorReasonCode = se.getErrorReasonCode();
        this.errorDescription = se.getErrorDescription();
        this.errorInternalStatusCode = se.getErrorInternalStatusCode();
        if (se.getAdditionalData() != null)
            this.additionalData = se.getAdditionalData();
    }

    public ErrorResponse(Errors errors) {
        this.errorStatusCode = errors.getStatus().value();
        this.errorReasonCode = errors.getCode();
        this.errorDescription = errors.getDescription();
        this.errorInternalStatusCode = errors.getInternalErrorCode();
    }
}
