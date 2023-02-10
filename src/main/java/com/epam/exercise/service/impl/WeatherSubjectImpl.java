package com.epam.exercise.service.impl;

import com.epam.exercise.domain.Weather;
import com.epam.exercise.service.IClientObserver;
import com.epam.exercise.service.IWeatherSubject;

import java.util.List;


/**
 * 客户端观察者实现类
 * 用于在客户端获得最新天气信息时输出天气变化
 *
 * @author KC Yao
 * @date 2023-02-10
 */
public class WeatherSubjectImpl implements IWeatherSubject {

    /** 观察者对象集合 */
    private List<IClientObserver> observers;

    /**
     * 创建类时加载观察者对象
     *
     */
    public WeatherSubjectImpl(List<IClientObserver> observers){
        this.observers = observers;
    }

    /**
     * 添加观察者
     *
     * @param observer 观察者对象
     */
    @Override
    public void addObserver(IClientObserver observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer 观察者对象
     */
    @Override
    public void deleteObserver(IClientObserver observer) {
        observers.remove(observer);
    }

    /**
     * 通知天气变化
     *
     * @param weather 天气信息
     */
    @Override
    public void notifyObservers(Weather weather) {

        // 循环通知观察者天气变化
        for (IClientObserver observer : observers) {
            observer.update(weather);
        }
    }
}
