package com.jw.rs.demo.api;

import com.jw.rs.annotation.RestApi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Demo REST resource which is used to define different endpoints.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
@RestApi
@Path("/demo")
@Consumes(MediaType.APPLICATION_JSON)
public interface DemoResource {

    /**
     * Gets data given demo Id.
     *
     * @param demoId demo Id
     * @return REST Response object
     */
    @GET
    @Path("/data/{demoId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDemoData(@PathParam("demoId") Integer demoId);

}
