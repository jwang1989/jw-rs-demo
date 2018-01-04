package com.jw.rs.demo.facade.impl;

import com.jw.rs.demo.builder.impl.DemoDataBuilderImpl;
import com.jw.rs.demo.facade.DemoFacade;
import com.jw.rs.demo.model.DemoData;
import com.jw.rs.demo.model.DemoDataModel;
import com.jw.rs.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Implementation of DemoFacade.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoFacadeImpl implements DemoFacade {

    private static final Logger LOG = LoggerFactory.getLogger(DemoFacadeImpl.class);

    @Autowired
    private DemoService demoService;

    @Override
    public DemoDataModel getDemoDataModel(Integer demoId) {
        LOG.info(String.format("Retrieve DemoDataModel given demo Id %d", demoId));
        DemoData demoData = demoService.getDemoData(demoId);
        return new DemoDataBuilderImpl().demoData(demoData).buildDemoDataModel();
    }

}
