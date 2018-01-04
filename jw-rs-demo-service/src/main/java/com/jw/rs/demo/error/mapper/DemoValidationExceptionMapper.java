package com.jw.rs.demo.error.mapper;

import com.jw.rs.demo.error.DemoValidationException;
import com.jw.rs.model.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Error handler which is used to handle validation error.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
@Provider
@Component
public class DemoValidationExceptionMapper implements ExceptionMapper<DemoValidationException> {

    private static final Logger LOG = LoggerFactory.getLogger(DemoValidationExceptionMapper.class);

    @Override
    public Response toResponse(DemoValidationException exception) {
        LOG.warn(String.format("Validation error: %s", exception.getMessage()));
        ErrorResponse errorResponse = new ErrorResponse(exception.getErrorCode().getStatus().getStatusCode(),
                exception.getMessage());
        return Response.status(exception.getErrorCode().getStatus()).entity(errorResponse).build();
    }
}
