package com.example.jacksonvalidationissue.model;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonalInfo {

    @NotNull(message = "email must not be null")
    private String email;
    private String address;
}
