package com.jinpalhawang.jambudvipa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplication {

  private static final Logger log = LoggerFactory.getLogger(DiscoveryApplication.class);

  public static void main(String[] args) {
    final SpringApplication app = new SpringApplication(DiscoveryApplication.class);
    app.setLogStartupInfo(false);
    app.run(args);
    log.info(DiscoveryApplication.class.getSimpleName() + " started.");
  }

}
