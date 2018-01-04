package com.jw.rs.demo.service.impl;

import com.jw.rs.demo.error.DemoErrorCode;
import com.jw.rs.demo.error.DemoValidationException;
import com.jw.rs.demo.model.DemoData;
import com.jw.rs.demo.service.DemoService;
import net.sourceforge.cobertura.CoverageIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Implementation of DemoService.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public class DemoServiceImpl implements DemoService {

    private static final Logger LOG = LoggerFactory.getLogger(DemoServiceImpl.class);

    private Map<Integer, DemoData> dataMap;

    @Override
    public DemoData getDemoData(Integer demoId) {
        DemoData demoData = dataMap.get(demoId);
        if (demoData == null) {
            throw new DemoValidationException(DemoErrorCode.VALIDATION_ERROR, "demoId", demoId);
        }
        return demoData;
    }

    /**
     * Construct mock data collection.
     */
    @PostConstruct
    @CoverageIgnore
    public void setup() {
        LOG.info("Init mock data");
        dataMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            DemoData demoData = new DemoData();
            demoData.setId(UUID.randomUUID().toString());
            demoData.setDemoId(i);
            demoData.setMessage(String.format("Message [%d]", i));
            dataMap.put(i, demoData);
        }
    }

}
