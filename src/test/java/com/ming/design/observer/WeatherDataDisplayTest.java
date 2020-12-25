package com.ming.design.observer;

import org.junit.Test;

/**
 * @author ming
 * @date 2020-04-26 23:20
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
