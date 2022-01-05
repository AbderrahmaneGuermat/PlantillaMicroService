package com.microservicios.servicioejemplo.controller;

import com.microservicios.interfaces.example.ExampleController.ExampleControllerFeign;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.reactive.function.client.WebClient;

/**
 * The type Ejemplo.
 * @author joseluis.anton
 */
@RestController
@RequestMapping("/ejemplo")
public class Ejemplo {

  @Autowired
  private ExampleControllerFeign exampleControllerFeign;

  /**
   * Get saludo desde example string.
   *
   * @return the string
   */
  @GetMapping("/feign")
  public String getSaludoDesdeExample()
      throws URISyntaxException, IOException, InterruptedException {
   return exampleControllerFeign.getSaludo();
  }
  @GetMapping("/httpClient")
  public String getSaludoDesdeExampleJava11()
      throws URISyntaxException, IOException, InterruptedException {
    HttpClient httpClient = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .connectTimeout(Duration.ofSeconds(10))
        .build();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI("http://localhost:8081/entity/"))
        .GET()
        .build();
    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    return response.body();
  }
}
