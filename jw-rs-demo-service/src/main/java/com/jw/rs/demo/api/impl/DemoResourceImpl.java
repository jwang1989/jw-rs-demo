package com.jw.rs.demo.api.impl;

import com.jw.rs.demo.api.DemoResource;
import com.jw.rs.demo.facade.DemoFacade;
import com.jw.rs.demo.model.DemoDataModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

/**
 * Implementation of DemoResource.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
@Component
public class DemoResourceImpl implements DemoResource {

    private static final Logger LOG = LoggerFactory.getLogger(DemoResourceImpl.class);

    @Autowired
    private DemoFacade demoFacade;

    @Override
    public Response getDemoData(Integer demoId) {
        DemoDataModel demoDataModel = demoFacade.getDemoDataModel(demoId);
        return Response.status(Response.Status.OK).entity(demoDataModel).build();
    }

}
