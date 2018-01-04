package com.jw.rs.demo.error;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Junit test class of {@link DemoException}.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoExceptionTest {

    /**
     * Test method {@link DemoException#DemoException(DemoErrorCode, Object...)}.
     */
    @Test
    public void testBuildDemoExceptionWithErrorCode() {
        DemoException demoException = new DemoException(DemoErrorCode.UNKNWON_ERROR);
        assertEquals(DemoErrorCode.UNKNWON_ERROR, demoException.getErrorCode());
        assertEquals(DemoErrorCode.UNKNWON_ERROR.getMessage(), demoException.getMessage());
    }

    /**
     * Test method {@link DemoException#DemoException(Throwable, DemoErrorCode, Object...)}.
     */
    @Test
    public void testBuildDemoExceptionWithCauseAndErrorCode() {
        Exception exception = new Exception();
        DemoException demoException = new DemoException(exception, DemoErrorCode.UNKNWON_ERROR);
        assertEquals(DemoErrorCode.UNKNWON_ERROR, demoException.getErrorCode());
        assertEquals(DemoErrorCode.UNKNWON_ERROR.getMessage(), demoException.getMessage());
        assertEquals(exception, demoException.getCause());
    }

}
