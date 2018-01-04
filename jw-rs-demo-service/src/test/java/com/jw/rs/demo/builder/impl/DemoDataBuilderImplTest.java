package com.jw.rs.demo.builder.impl;

import com.jw.rs.demo.data.TestData;
import com.jw.rs.demo.model.DemoData;
import com.jw.rs.demo.model.DemoDataModel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Junit test class of {@link DemoDataBuilderImpl}.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoDataBuilderImplTest {

    /**
     * Test method {@link DemoDataBuilderImpl#buildDemoDataModel()}.
     */
    @Test
    public void buildDemoDataModel() {
        DemoData demoData = TestData.demoData();
        DemoDataModel demoDataModel = new DemoDataBuilderImpl().demoData(demoData).buildDemoDataModel();
        assertNotNull(demoDataModel);
        assertEquals(demoData.getId(), demoDataModel.getId());
        assertEquals(demoData.getDemoId(), demoDataModel.getDemoId());
        assertEquals(demoData.getMessage(), demoDataModel.getMessage());
    }

    /**
     * Test method {@link DemoDataBuilderImpl#buildDemoDataModel()}.
     */
    @Test (expected = IllegalArgumentException.class)
    public void buildDemoDataModelWithoutDemoData() {
        DemoDataModel demoDataModel = new DemoDataBuilderImpl().buildDemoDataModel();
        assertNull(demoDataModel);
    }

}
