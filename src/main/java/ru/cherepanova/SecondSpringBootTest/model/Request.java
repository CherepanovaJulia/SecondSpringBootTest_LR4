package ru.cherepanova.SecondSpringBootTest.model;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank
    private String uid;
    @NotBlank
    private String operationUid;
    private String systemName;
   // @NotBlank
    private String systemTime;
    private String source;

    @Min(1)
    @Max(100000)
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;

    @Override
    public String toString(){
        return "{" +
                "uid = '" + uid + '\'' +
                ", operationUid = '" + operationUid + '\'' +
                ", systemName = '" + systemName + '\'' +
                ", systemTime = '" + systemTime + '\'' +
                ", source = '" + source + '\'' +
                ", communicationId = '" + communicationId +
                ", templateId = '" + templateId +
                ", productCode = '" + productCode +
                ", smsCode = '" + smsCode +
                "}";
    }

    public boolean isUidValid(){
        return !uid.equals("123");
    }
}
