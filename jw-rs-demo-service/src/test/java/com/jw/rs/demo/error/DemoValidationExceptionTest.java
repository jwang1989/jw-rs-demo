package com.jw.rs.demo.error;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Junit test class of {@link DemoValidationException}.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoValidationExceptionTest {

    /**
     * Test method {@link DemoValidationException#DemoValidationException(DemoErrorCode, Object...)}.
     */
    @Test
    public void testBuildDemoValidationExceptionWithErrorCode() {
        DemoValidationException demoValidationException = new DemoValidationException(DemoErrorCode.VALIDATION_ERROR,
                "a", "b");
        assertEquals(DemoErrorCode.VALIDATION_ERROR, demoValidationException.getErrorCode());
        assertEquals(String.format(DemoErrorCode.VALIDATION_ERROR.getMessage(), "a", "b"),
                demoValidationException.getMessage());
    }

    /**
     * Test method {@link DemoValidationException#DemoValidationException(Throwable, DemoErrorCode, Object...)}.
     */
    @Test
    public void testBuildDemoValidationExceptionWithCauseAndErrorCode() {
        Exception exception = new Exception();
        DemoValidationException demoValidationException = new DemoValidationException(exception,
                DemoErrorCode.VALIDATION_ERROR, "a", "b");
        assertEquals(DemoErrorCode.VALIDATION_ERROR, demoValidationException.getErrorCode());
        assertEquals(String.format(DemoErrorCode.VALIDATION_ERROR.getMessage(), "a", "b"),
                demoValidationException.getMessage());
        assertEquals(exception, demoValidationException.getCause());
    }

}
