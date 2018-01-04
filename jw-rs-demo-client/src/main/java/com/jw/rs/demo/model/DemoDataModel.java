package com.jw.rs.demo.model;

import java.io.Serializable;

/**
 * Demo client model which is used to carry data around.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoDataModel implements Serializable {

    private static final long serialVersionUID = -2187225613838276871L;

    private String id;

    private Integer demoId;

    private String message;

    /**
     * Gets unique string Id.
     *
     * @return id unique Id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets unique string Id.
     *
     * @param id unique Id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets demo Id.
     *
     * @return demoId demo Id
     */
    public Integer getDemoId() {
        return demoId;
    }

    /**
     * Sets demo Id.
     *
     * @param demoId demo Id
     */
    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    /**
     * Gets message.
     *
     * @return message message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /*
     * (non-Javadoc)
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "DemoDataModel{" + "id='" + id + '\'' + ", demoId=" + demoId + ", message='" + message + '\'' + '}';
    }

}
