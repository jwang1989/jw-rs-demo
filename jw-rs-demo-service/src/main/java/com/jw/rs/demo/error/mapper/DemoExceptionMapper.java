package com.jw.rs.demo.error.mapper;

import com.jw.rs.demo.error.DemoException;
import com.jw.rs.model.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * DemoException mapper which is used to handle unexpected error.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
@Provider
@Component
public class DemoExceptionMapper implements ExceptionMapper<DemoException> {

    private static final Logger LOG = LoggerFactory.getLogger(DemoExceptionMapper.class);

    @Override
    public Response toResponse(DemoException exception) {
        LOG.error(String.format("Internal Error: %s", exception.getMessage()));
        ErrorResponse errorResponse = new ErrorResponse(exception.getErrorCode().getStatus().getStatusCode(),
                exception.getMessage());
        return Response.status(exception.getErrorCode().getStatus()).entity(errorResponse).build();
    }
}
