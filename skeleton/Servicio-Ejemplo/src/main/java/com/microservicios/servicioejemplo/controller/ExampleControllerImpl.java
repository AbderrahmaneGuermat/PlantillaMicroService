package com.microservicios.servicioejemplo.controller;

import com.microservicios.interfaces.example.ExampleController;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Example controller.
 * @author joseluis.anton
 */
@RestController
@RequestMapping("/entity")
@RefreshScope
public class ExampleControllerImpl implements ExampleController {

  @Value("${variable.example}")
  private String propiedad;
  @GetMapping("/")
  @CircuitBreaker(name="standard")
  public String getSaludo(){

   return "hola "+propiedad;
  }
}
