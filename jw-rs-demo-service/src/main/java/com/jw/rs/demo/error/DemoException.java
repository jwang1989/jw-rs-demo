package com.jw.rs.demo.error;

/**
 * General exception for unexpected error.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoException extends RuntimeException {

    private static final long serialVersionUID = -2187221373438276871L;

    private DemoErrorCode errorCode;

    /**
     * Constructs DemoException with error code.
     *
     * @param errorCode DemoErrorCode enum
     * @param args optional args in DemoErrorCode enum
     */
    public DemoException(DemoErrorCode errorCode, Object ...args) {
        super(String.format(errorCode.getMessage(), args));
        this.errorCode = errorCode;
    }

    /**
     * Constructs DemoException with error code and cause exception.
     *
     * @param cause Throwable cause
     * @param errorCode DemoErrorCode enum
     * @param args optional args in DemoErrorCode enum
     */
    public DemoException(Throwable cause, DemoErrorCode errorCode, Object ...args) {
        super(String.format(errorCode.getMessage(), args), cause);
        this.errorCode = errorCode;
    }

    /**
     * Get error code.
     *
     * @return DemoErrorCode object
     */
    public DemoErrorCode getErrorCode() {
        return this.errorCode;
    }

}
