package com.jw.rs.demo.error.mapper;

import com.jw.rs.demo.error.DemoErrorCode;
import com.jw.rs.demo.error.DemoValidationException;
import com.jw.rs.model.ErrorResponse;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Junit test class of {@link DemoValidationExceptionMapper}.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoValidationExceptionMapperTest {

    private DemoValidationExceptionMapper mapper;

    @Before
    public void setup() {
        mapper = new DemoValidationExceptionMapper();
    }

    /**
     * Test method {@link DemoValidationExceptionMapper#toResponse(DemoValidationException)}.
     */
    @Test
    public void testToResponse() {
        DemoValidationException demoValidationException = new DemoValidationException(DemoErrorCode.VALIDATION_ERROR, "a", "b");
        Response response = mapper.toResponse(demoValidationException);
        assertNotNull(response);

        Object entity = response.getEntity();
        assertTrue(entity instanceof ErrorResponse);
        ErrorResponse errorResponse = (ErrorResponse) entity;
        assertEquals(Integer.valueOf(Response.Status.BAD_REQUEST.getStatusCode()),
                errorResponse.getStatus());
        assertEquals(String.format(DemoErrorCode.VALIDATION_ERROR.getMessage(), "a", "b"), errorResponse.getReason());
    }

}
