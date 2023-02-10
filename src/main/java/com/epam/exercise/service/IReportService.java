package com.epam.exercise.service;

import com.epam.exercise.domain.Weather;

/**
 * 每分钟提供最新的报告
 *
 * @author KC Yao
 * @date 2023-02-10
 */
public interface IReportService {

    /**
     * 生成天气报告
     *
     * @return Weather 天气信息
     */
     Weather create();
}
