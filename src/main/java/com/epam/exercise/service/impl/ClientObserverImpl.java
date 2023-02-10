package com.epam.exercise.service.impl;

import com.epam.exercise.domain.Weather;
import com.epam.exercise.service.IClientObserver;
import com.epam.exercise.utils.Constant;

/**
 * 客户端观察者实现类
 * 用于在客户端获得最新天气信息时输出天气变化
 *
 * @author KC Yao
 * @date 2023-02-10
 */
public class ClientObserverImpl implements IClientObserver {

    /** 客户端名称 */
    private  String name;

    public ClientObserverImpl(String name) {
        this.name = name;
    }

    /**
     * 更新时 输出天气的温度、湿度、气压信息
     *
     * @param weather 天气信息
     */
    @Override
    public void update(Weather weather) {
        System.out.println(name + Constant.COLON + weather.toString());
    }
}
