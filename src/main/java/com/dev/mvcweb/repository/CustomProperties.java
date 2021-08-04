package com.dev.mvcweb.repository;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@ConfigurationProperties(prefix = "com.dev.mvcweb")
@Data
public class CustomProperties {

    private String apiUrl;

}