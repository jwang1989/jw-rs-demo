package com.jw.rs.demo.error;

import javax.ws.rs.core.Response;

/**
 * Defines ordinary error code given enum type.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public enum DemoErrorCode {

    VALIDATION_ERROR(Response.Status.BAD_REQUEST, "Could not find data given [%s, %s]"),
    UNKNWON_ERROR(Response.Status.INTERNAL_SERVER_ERROR, "Unknown error happens");

    private Response.Status statusCode;

    private String message;

    private DemoErrorCode(Response.Status statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    /**
     * Gets status code.
     *
     * @return statusCode status code
     */
    public Response.Status getStatus() {
        return statusCode;
    }

    /**
     * Gets message.
     *
     * @return message the message
     */
    public String getMessage() {
        return message;
    }

}
