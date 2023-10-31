package com.amazon.service.gateway.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class WebEndpoints {

  @Bean
  public RouterFunction<ServerResponse> routerFunction() {
    return RouterFunctions.route()
      .GET("/fallback/order", request -> ServerResponse.ok().bodyValue("Order service is down. Please try again later."))
      .build();
  }

}
