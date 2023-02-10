package com.epam.exercise.service.impl;

import com.epam.exercise.domain.Weather;
import com.epam.exercise.service.IClientObserver;
import org.junit.Test;

/**
 * 观察者测试类
 *
 * @author KC Yao
 * @date 2023-02-10
 */
public class ClientObserverImplTest {

    @Test
    public void update() {
        Weather weather = new Weather();
        weather.setTemperature(1);
        weather.setHumidity(2);
        weather.setPressure(3f);
        IClientObserver observer = new ClientObserverImpl("clent1");
        observer.update(weather);
    }
}