package com.ming.design.observer;

import java.util.Observable;

/**
 * 天气数据
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData() {

    }

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
