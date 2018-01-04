package com.jw.rs.demo.error.mapper;

import com.jw.rs.demo.error.DemoErrorCode;
import com.jw.rs.demo.error.DemoException;
import com.jw.rs.model.ErrorResponse;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Junit test class of {@link DemoExceptionMapper}.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoExceptionMapperTest {

    private DemoExceptionMapper mapper;

    @Before
    public void setup() {
        mapper = new DemoExceptionMapper();
    }

    /**
     * Test method {@link DemoExceptionMapper#toResponse(DemoException)}.
     */
    @Test
    public void testToResponse() {
        DemoException demoException = new DemoException(DemoErrorCode.UNKNWON_ERROR);
        Response response = mapper.toResponse(demoException);
        assertNotNull(response);

        Object entity = response.getEntity();
        assertTrue(entity instanceof ErrorResponse);
        ErrorResponse errorResponse = (ErrorResponse) entity;
        assertEquals(Integer.valueOf(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()),
                errorResponse.getStatus());
        assertEquals(DemoErrorCode.UNKNWON_ERROR.getMessage(), errorResponse.getReason());
    }

}
