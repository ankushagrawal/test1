package com.quizzo.core.utils.idempotency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class RequestIdempotentConfiguration {
    @Bean
    public RequestIdempotentAspect getRequestIdempotentAspect() {
        return new RequestIdempotentAspect();
    }
}
