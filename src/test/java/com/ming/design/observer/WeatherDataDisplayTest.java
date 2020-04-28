package com.ming.design.observer;

import com.ming.design.observer.CurrentConditionsDisplay;
import com.ming.design.observer.WeatherData;
import org.junit.Test;

/**
 * @program: design-pattern
 * @description: 天气显示测试
 * @author: ming
 * @date: 2020-04-28 00:28
 */
public class WeatherDataDisplayTest {

    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.3f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
