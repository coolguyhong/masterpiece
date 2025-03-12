package com.pjsconsulting.masterpiece.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // 모든 엔드포인트에 대해 CORS를 적용
                        .allowedOrigins("http://localhost:3000") // 허용할 출처
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 메서드
                        .allowedHeaders("*") // 모든 헤더를 허용
                        .allowCredentials(true) // 자격 증명을 허용
                        .maxAge(3600); // Preflight 결과를 1시간 동안 캐시
            }
        };
    }
}
