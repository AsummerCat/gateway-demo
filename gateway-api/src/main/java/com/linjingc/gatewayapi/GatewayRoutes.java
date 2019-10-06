//package com.linjingc.gatewayapi;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * 代码化router
// */
//@Configuration
//public class GatewayRoutes {
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r ->
//                        r.path("/helloword")
//                                .uri("http://localhost:9090/helloword")
//                )
//                .build();
//    }
//}