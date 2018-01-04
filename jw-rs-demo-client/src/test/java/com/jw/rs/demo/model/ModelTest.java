package com.jw.rs.demo.model;

import com.jw.rs.demo.util.ModelInvoker;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test class to test models.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class ModelTest {

    private ModelInvoker invoker;

    @Before
    public void setup() {
        invoker = new ModelInvoker();
    }

    /**
     * Test all models by invoking basic methods including setter, getters, toString, equals and hashCode.
     *
     * @throws Exception when error occurs
     */
    @Test
    public void testModel() throws Exception {
        invoker.invokeModel(new DemoDataModel(), true);
    }

}
