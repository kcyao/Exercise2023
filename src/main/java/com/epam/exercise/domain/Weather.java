package com.epam.exercise.domain;

import com.epam.exercise.utils.Constant;

import java.io.Serializable;
import java.util.Objects;

/**
 * 天气相关属性信息
 *
 * @author KC Yao
 * @date 2023-02-10
 */
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;

    /**温度*/
    private Integer temperature;

    /**湿度*/
    private Integer humidity;

    /**气压*/
    private Float pressure;

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Objects.equals(temperature, weather.temperature) && Objects.equals(humidity, weather.humidity) && Objects.equals(pressure, weather.pressure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, humidity, pressure);
    }

    @Override
    public String toString() {
        StringBuffer str =  new StringBuffer();
        str.append(getTemperature());
        str.append(Constant.COMMA);
        str.append(getHumidity());
        str.append(Constant.COMMA);
        str.append(getPressure());
        return str.toString();
    }
}
