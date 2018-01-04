package com.jw.rs.demo.facade;

import com.jw.rs.demo.model.DemoDataModel;

/**
 * Demo facade layer which is used to provide a simplified interface between resource and service.
 * Follow Facade design pattern.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public interface DemoFacade {

    /**
     * Retrieve DemoDataModel given demo Id.
     *
     * @param demoId demo Id
     * @return DemoDataModel object
     */
    public DemoDataModel getDemoDataModel(Integer demoId);

}
