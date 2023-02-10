package com.epam.exercise.job;

import com.epam.exercise.Exercise2023Application;
import com.epam.exercise.service.impl.ClientObserverImplTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 定时任务-报告服务测试类
 *
 * @author KC Yao
 * @date 2023-02-10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherJobTest  {

    @Autowired
    private WeatherJob weatherJob;

    /**
     * 测试定时任务执行方式 是否能够正常通知观察者天气的变化
     */
    @Test
    public void create() {
        weatherJob.create();
    }
}