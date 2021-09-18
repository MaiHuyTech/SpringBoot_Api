package com.example.springboot_api.DTO;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

/**
 * @author MPHuy on 17/09/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StudentDTO {
    private long id;
    private String nameStudent;

}
