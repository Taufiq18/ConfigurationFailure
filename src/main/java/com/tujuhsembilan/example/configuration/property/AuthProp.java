package com.tujuhsembilan.example.configuration.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Validated
@Data
@Component
@ConfigurationProperties(prefix = "application.security")
public class AuthProp {

    @NotBlank(message = "UUID must not be blank")
    private String uuid;

    @Min(value = 8, message = "Strength must be at least 8")
    private Integer strength = 8;

    private String systemUsername;
    private String systemPassword;
}
