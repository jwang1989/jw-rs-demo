package com.jw.rs.demo.builder.impl;

import com.jw.rs.demo.builder.DemoDataBuilder;
import com.jw.rs.demo.model.DemoData;
import com.jw.rs.demo.model.DemoDataModel;

/**
 * Implementation of DemoDataBuilder.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoDataBuilderImpl implements DemoDataBuilder {

    private DemoData demoData;

    /**
     * Sets DemoData object.
     *
     * @param demoData DemoData object
     * @return DemoDataBuilderImpl object
     */
    public DemoDataBuilderImpl demoData(DemoData demoData) {
        this.demoData = demoData;
        return this;
    }

    @Override
    public DemoDataModel buildDemoDataModel() {
        if (demoData == null) {
            throw new IllegalArgumentException("DemoData model is needed to build DemoDataModel");
        }
        DemoDataModel demoDataModel = new DemoDataModel();
        demoDataModel.setId(demoData.getId());
        demoDataModel.setDemoId(demoData.getDemoId());
        demoDataModel.setMessage(demoData.getMessage());
        return demoDataModel;
    }
}
