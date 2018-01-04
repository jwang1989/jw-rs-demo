package com.jw.rs.demo.data;

import com.jw.rs.demo.model.DemoData;

import java.util.UUID;

/**
 * Test data collection.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class TestData {

    /**
     * Generates mock DemoData object.
     *
     * @return DemoData object
     */
    public static DemoData demoData() {
        DemoData demoData = new DemoData();
        demoData.setId(UUID.randomUUID().toString());
        demoData.setDemoId(1);
        demoData.setMessage("Message [1]");
        return demoData;
    }

}
