package com.epam.exercise.job;

import com.epam.exercise.service.IClientObserver;
import com.epam.exercise.service.IReportService;
import com.epam.exercise.service.IWeatherSubject;
import com.epam.exercise.service.impl.ClientObserverImpl;
import com.epam.exercise.service.impl.WeatherSubjectImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气定时任务
 *
 * @author KC Yao
 * @date 2023-02-10
 */
@Component
public class WeatherJob {

    /**
     * 天气报告服务
     */
    private final IReportService reportService;

    public WeatherJob(IReportService reportService) {
        this.reportService = reportService;
    }

    /**
     * 每分钟生成一次天气信息并通知观察者
     */
    @Scheduled(cron = "0 * * * * ?")
    public void create(){
        System.out.println("------定时任务开始------");

        // 创建观察者集合
        List<IClientObserver> observers = new ArrayList<>();
        IClientObserver observer;

        //动态创建观察者
        for (int i =1; i <= 10; i++){
            // 创建客户端
            observer = new ClientObserverImpl("client"+i);
            observers.add(observer);
        }

        // 变更天气信息并通知观察者
        IWeatherSubject subject = new WeatherSubjectImpl(observers);
        subject.notifyObservers(reportService.create());
        System.out.println("------定时任务结束------");
    }
}
