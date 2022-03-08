package com.samplemicroserviceproject.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/music/song/**")
                        .uri("lb://music-service"))
                .route(p -> p.path("/radio/song/**")
                        .uri("lb://radio-service"))
                .build();
    }

}