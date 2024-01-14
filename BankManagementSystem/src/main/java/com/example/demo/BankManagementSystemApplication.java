package com.example.demo;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "The Bank App",
                description = "Backend Rest APIs for TJA Bank",
                version = "v1.0",
                contact = @Contact(
                        name = "giri",
                        email = "giri2552q@gmail.com",
                        url = "https://github.com/girigiri07/Bank Management System"
                ),
                license = @License(
                        name = "The giri",
                        url = "https://github.com/girigiri07/Bank Management System"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "The  Bank App Documentation",
                url = "https://github.com/girigiri07/Bank Management System"
        )

)
public class BankManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankManagementSystemApplication.class, args);
	}

}
