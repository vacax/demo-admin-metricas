package edu.pucmm.eict.demoadminmetricas;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class DemoAdminMetricasApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAdminMetricasApplication.class, args);
    }

}
