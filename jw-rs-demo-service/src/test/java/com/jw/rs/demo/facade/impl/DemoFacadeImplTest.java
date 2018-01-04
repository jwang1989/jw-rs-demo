package com.jw.rs.demo.facade.impl;

import com.jw.rs.demo.data.TestData;
import com.jw.rs.demo.facade.DemoFacade;
import com.jw.rs.demo.model.DemoData;
import com.jw.rs.demo.model.DemoDataModel;
import com.jw.rs.demo.service.DemoService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * Junit test class of {@link DemoFacadeImpl}.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoFacadeImplTest {

    @Mock
    private DemoService demoService;

    @InjectMocks
    private DemoFacade demoFacade;

    @Before
    public void setup() {
        demoFacade = new DemoFacadeImpl();
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test method {@link DemoFacadeImpl#getDemoDataModel(Integer)}.
     */
    @Test
    public void testGetDemoDataModel() {
        DemoData demoData = TestData.demoData();
        when(demoService.getDemoData(1)).thenReturn(demoData);

        DemoDataModel demoDataModel = demoFacade.getDemoDataModel(1);

        assertNotNull(demoDataModel);
        assertEquals(demoData.getId(), demoDataModel.getId());
        assertEquals(demoData.getDemoId(), demoDataModel.getDemoId());
        assertEquals(demoData.getMessage(), demoDataModel.getMessage());
    }

}
