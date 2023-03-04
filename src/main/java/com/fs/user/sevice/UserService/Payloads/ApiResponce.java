package com.fs.user.sevice.UserService.Payloads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponce
{
    private String msg;

    private Boolean success;

    private HttpStatus status;
}

