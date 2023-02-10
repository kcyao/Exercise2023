package com.epam.exercise.service;

import com.epam.exercise.domain.Weather;

/**
 * 主题接口
 *
 * @author KC Yao
 * @date 2023-02-10
 */
public interface IWeatherSubject {

    /**
     * 添加观察者
     *
     * @param observer 观察者对象
     */
    void addObserver(IClientObserver observer);

    /**
     * 删除观察者
     *
     * @param observer 观察者对象
     */
     void deleteObserver(IClientObserver observer);

    /**
     * 通过观察者
     *
     * @param weather 天气信息
     */
     void notifyObservers(Weather weather);

}
