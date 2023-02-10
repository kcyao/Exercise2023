package com.epam.exercise.service.impl;

import com.epam.exercise.domain.Weather;
import com.epam.exercise.service.IReportService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * 每分钟提供最新的报告
 *
 * @author KC Yao
 * @date 2023-02-10
 */
@Service
public class ReportServiceImpl implements IReportService {

    /**
     * 生成天气报告
     *
     * @return Weather 天气信息
     */
    @Override
    public Weather create() {
        Random random = new Random();
        Weather weather = new Weather();
        //生成[-50,50)区间的整数
        weather.setTemperature(random.nextInt(100) - 50);

        // 生100以内的浮点数并且小数位数为1
        BigDecimal bigDecimal = BigDecimal.valueOf(random.nextFloat() * 100);
        weather.setPressure(bigDecimal.setScale(1, RoundingMode.HALF_UP).floatValue());

        //生成[0,100)区间的整数
        weather.setHumidity(random.nextInt(100));

        return weather;
    }
}
