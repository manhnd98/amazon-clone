package com.amazon.service.orderservice.config;

import jakarta.validation.constraints.NotNull;
import java.net.URI;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "amz.client")
public record ClientProperties (
  @NotNull
  URI catalogServiceUri
){

}
