package com.jw.rs.demo.config;

import com.jw.rs.demo.facade.DemoFacade;
import com.jw.rs.demo.service.DemoService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Junit test class of {@link DemoServiceConfig}.
 *
 * @author JWang
 * @since Jan 02, 2018
 */
public class DemoServiceConfigTest {

    private DemoServiceConfig config;

    @Before
    public void setup() {
        config = new DemoServiceConfig();
    }

    /**
     * Test method {@link DemoServiceConfig#demoFacade()}.
     */
    @Test
    public void testBuildDemoFacade() {
        DemoFacade demoFacade = config.demoFacade();
        assertNotNull(demoFacade);
    }

    /**
     * Test method {@link DemoServiceConfig#demoService()}.
     */
    @Test
    public void testBuildDemoService() {
        DemoService demoService = config.demoService();
        assertNotNull(demoService);
    }

}
