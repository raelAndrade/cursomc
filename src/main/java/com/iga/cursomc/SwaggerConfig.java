package com.iga.cursomc;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Classe de configuração da ferramenta responsável pela documentação da api
 * 
 * @author Israel Andrade
 * 
 * Data de criação 14 de Ago de 2019
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {                                    
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()            
          .apis(RequestHandlerSelectors.basePackage("com.iga.cursomc.resource"))
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(this.apiInfo());                                           
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
          "CURSCO MODELAGEM CONCEITUAL REST API", 
          "CURSCO MODELAGEM CONCEITUAL REST API", 
          "1.0.0", 
          "Terms of service", 
          new Contact("Israel Andrade", "www.israelandrade.com", "israelg.andrade@gmail.com"), 
          "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
    }
}