package com.jw.rs.demo.error;

/**
 * Validation error exception.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoValidationException extends DemoException {

    private static final long serialVersionUID = -2187221373438276882L;

    /**
     * Constructs DemoValidationException with error code.
     *
     * @param errorCode DemoErrorCode enum
     * @param args optional args in DemoErrorCode enum
     */
    public DemoValidationException(DemoErrorCode errorCode, Object... args) {
        super(errorCode, args);
    }

    /**
     * Constructs DemoValidationException with error code and cause exception.
     *
     * @param cause Throwable cause
     * @param errorCode DemoErrorCode enum
     * @param args optional args in DemoErrorCode enum
     */
    public DemoValidationException(Throwable cause, DemoErrorCode errorCode, Object... args) {
        super(cause, errorCode, args);
    }
}
