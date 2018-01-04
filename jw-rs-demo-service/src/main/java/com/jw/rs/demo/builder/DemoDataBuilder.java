package com.jw.rs.demo.builder;

import com.jw.rs.demo.model.DemoDataModel;

/**
 * Builder which is used to create either client model or data entity.
 * Follow Builder design pattern.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public interface DemoDataBuilder {

    /**
     * Builds DemoDataModel given certain parameters.
     *
     * @return DemoDataModel object
     */
    public DemoDataModel buildDemoDataModel();

}
