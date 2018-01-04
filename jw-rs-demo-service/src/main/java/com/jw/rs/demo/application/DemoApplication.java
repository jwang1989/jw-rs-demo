package com.jw.rs.demo.application;

import com.jw.rs.demo.config.DemoServiceConfig;
import net.sourceforge.cobertura.CoverageIgnore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Main spring boot application.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
@Configuration
@EnableAutoConfiguration
@Import(DemoServiceConfig.class)
@CoverageIgnore
public class DemoApplication {

    /**
     * Main application.
     *
     * @param args parameters
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
