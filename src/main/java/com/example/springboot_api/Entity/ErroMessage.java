package com.example.springboot_api.Entity;

import lombok.*;
import org.springframework.http.HttpStatus;

/**
 * @author MPHuy on 18/09/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ErroMessage {
    private HttpStatus status;
    private String message;
}
