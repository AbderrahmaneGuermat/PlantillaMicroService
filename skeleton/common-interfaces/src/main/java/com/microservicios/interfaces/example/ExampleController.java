package com.microservicios.interfaces.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The interface Example cotroller.
 * @author Hunters
 */
public interface ExampleController {

  /**
   * The interface Example cotroller feign.
   */
  @FeignClient(value = "servicio-ejemplo", contextId = "entity", path = "/entity")
  interface ExampleControllerFeign extends ExampleController {

  }

  /**
   * Gets saludo.
   */
  @GetMapping("/")
  String getSaludo();

}
