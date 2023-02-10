package com.epam.exercise.service.impl;

import com.epam.exercise.service.IReportService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 报告测试类
 *
 * @author KC Yao
 * @date 2023-02-10
 */
public class ReportServiceImplTest {

    @Test
    public void create() {
        IReportService reportService = new ReportServiceImpl();
        reportService.create();
        System.out.println("报告生成成功");
    }
}