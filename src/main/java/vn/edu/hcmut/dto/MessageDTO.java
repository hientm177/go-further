package vn.edu.hcmut.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;


@Data
@ToString
public class MessageDTO {
    private String message;
    @Min(value = 0)
    private int status;
}
