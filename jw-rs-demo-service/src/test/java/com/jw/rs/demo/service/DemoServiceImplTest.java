package com.jw.rs.demo.service;

import com.jw.rs.demo.error.DemoValidationException;
import com.jw.rs.demo.model.DemoData;
import com.jw.rs.demo.service.impl.DemoServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Junit class of {@link com.jw.rs.demo.service.impl.DemoServiceImpl}.
 *
 * @author JWang
 * @since Jan 02, 2018
 */
public class DemoServiceImplTest {

    private DemoServiceImpl demoService;

    @Before
    public void setup() {
        demoService = new DemoServiceImpl();
        demoService.setup();
    }

    /**
     * Test method {@link DemoServiceImpl#getDemoData(Integer)}.
     */
    @Test
    public void testGetDemoData() {
        DemoData demoData = demoService.getDemoData(1);
        assertNotNull(demoData);
    }

    /**
     * Test method {@link DemoServiceImpl#getDemoData(Integer)}.
     */
    @Test (expected = DemoValidationException.class)
    public void testGetDemoDataNotFound() {
        DemoData demoData = demoService.getDemoData(1000);
        assertNull(demoData);
    }

}
