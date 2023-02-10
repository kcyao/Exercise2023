package com.epam.exercise.service.impl;

import com.epam.exercise.domain.Weather;
import com.epam.exercise.service.IClientObserver;
import com.epam.exercise.service.IWeatherSubject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 天气主题测试类
 *
 * @author KC Yao
 * @date 2023-02-10
 */
public class WeatherSubjectImplTest {

    /** 观察者对象集合 */
    private List<IClientObserver> observers;
    IWeatherSubject subject = null;

    public WeatherSubjectImplTest (){
        observers = new ArrayList<>();
        IClientObserver Observer = new ClientObserverImpl("client1");
        observers.add(Observer);
        subject = new WeatherSubjectImpl(observers);
    }

    @Test
    public void addObserver() {
        IClientObserver Observer = new ClientObserverImpl("client2");
        subject.addObserver(Observer);
        assertEquals(observers.size(), 2);
    }

    @Test
    public void deleteObserver() {
        IClientObserver Observer = new ClientObserverImpl("client2");
        subject.deleteObserver(Observer);
        assertEquals(observers.size(), 1);

    }

    @Test
    public void notifyObservers() {
        Weather weather = new Weather();
        weather.setTemperature(1);
        weather.setHumidity(2);
        weather.setPressure(3f);
        subject.notifyObservers(weather);
    }
}