package com.jw.rs.demo.service;

import com.jw.rs.demo.model.DemoData;

/**
 * Demo service which is used to provide mock data, connect to remote server or connect to database.
 *
 * @author JWang
 * @since Jan 03, 2018
 */
public interface DemoService {

    /**
     * Gets DemoData object given demo Id.
     *
     * @param demoId demo Id
     * @return DemoData object
     */
    public DemoData getDemoData(Integer demoId);

}
