package com.example.jacksonvalidationissue.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

    @NotNull(message = "name must not be null")
    private String name;

    @Valid
    @JsonUnwrapped
    private PersonalInfo personalInfo;

}
