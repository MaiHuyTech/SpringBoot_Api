package com.example.springboot_api.DTO;

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
public class StudentDTO {
    private long id;
    private String nameStudent;
    private String classStudent;
}
