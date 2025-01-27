package com.example.privatespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class PrivateSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrivateSpringApplication.class, args);

//        @Bean
//        public Docket postsApi() {
//            return new Docket(DocumentationType.SWAGGER_2)
//                    .apiInfo(apiInfo()).select().build();
//        }
//        private ApiInfo apiInfo() {
//            return new ApiInfoBuilder().title("RealEstate API")
//                    .description("RealEstate API for developers").termsOfServiceUrl("").licenseUrl("dun.min30@gmail.com").version("1.0").build();
//        }
    }

}
