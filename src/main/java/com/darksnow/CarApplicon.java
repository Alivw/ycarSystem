package com.darksnow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
public class CarApplicon {
    public static void main(String[] args) {

        SpringApplication.run(CarApplicon.class,args);
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(handlerInterceptor()).excludePathPatterns("/", "/loginCheck", "/static/**").addPathPatterns("/**");

            }
        };
    }

    @Bean
    public HandlerInterceptor handlerInterceptor() {
        return new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                if (null == request.getSession().getAttribute("loginUser")) {
                    response.sendRedirect("/");
                    return false;
                }
                return true;
            }
        };
    }
}
