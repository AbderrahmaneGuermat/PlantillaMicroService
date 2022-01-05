package com.microservicios.interfaces.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * The Class InterfacesConfig.
 */
@Configuration
@EnableFeignClients("com.microservicios.interfaces")
public class InterfacesConfig {

}
