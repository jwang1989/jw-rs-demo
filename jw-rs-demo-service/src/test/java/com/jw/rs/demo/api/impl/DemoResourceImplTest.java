package com.jw.rs.demo.api.impl;

import com.jw.rs.demo.api.DemoResource;
import com.jw.rs.demo.facade.DemoFacade;
import com.jw.rs.demo.model.DemoDataModel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Junit test class of {@link DemoResourceImpl}.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoResourceImplTest {

    @Mock
    private DemoFacade demoFacade;

    @InjectMocks
    private DemoResource demoResource;

    @Before
    public void setup() {
        demoResource = new DemoResourceImpl();
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test method {@link DemoResourceImpl#getDemoData(Integer)}.
     */
    @Test
    public void testGetDemoData() {
        DemoDataModel demoDataModel = mock(DemoDataModel.class);
        when(demoFacade.getDemoDataModel(1)).thenReturn(demoDataModel);

        demoResource.getDemoData(1);

        verify(demoFacade, times(1)).getDemoDataModel(1);
    }

}
