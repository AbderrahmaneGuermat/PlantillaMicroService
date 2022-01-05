package com.microservicios.apigatewayejemplo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

  /**
   * Main.
   *
   * @param args the args
   */
  public static void main(final String[] args) {
    SpringApplication.run(ApiGatewayApplication.class, args);
  }


}
