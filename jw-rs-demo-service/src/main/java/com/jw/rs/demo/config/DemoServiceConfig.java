package com.jw.rs.demo.config;

import com.jw.rs.config.RestCoreConfig;
import com.jw.rs.demo.facade.DemoFacade;
import com.jw.rs.demo.facade.impl.DemoFacadeImpl;
import com.jw.rs.demo.service.DemoService;
import com.jw.rs.demo.service.impl.DemoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Demo service config which is used to define beans.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
@Configuration
@Import(value = { RestCoreConfig.class })
@ComponentScan(basePackages = { "com.jw.rs.demo" })
public class DemoServiceConfig {

    /**
     * Creates a singleton DemoFacade bean.
     *
     * @return DemoFacade bean
     */
    @Bean
    public DemoFacade demoFacade() {
        return new DemoFacadeImpl();
    }

    /**
     * Creates a singleton DemoService bean.
     *
     * @return DemoService bean
     */
    @Bean
    public DemoService demoService() {
        return new DemoServiceImpl();
    }

}
