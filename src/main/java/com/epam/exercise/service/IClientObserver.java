package com.epam.exercise.service;

import com.epam.exercise.domain.Weather;

/**
 * 观察者接口
 *
 * @author KC Yao
 * @date 2023-02-10
 */
public interface IClientObserver {

    /**
     *
     * @param weather 天气信息
     *
     */
     void update (Weather weather);
}
