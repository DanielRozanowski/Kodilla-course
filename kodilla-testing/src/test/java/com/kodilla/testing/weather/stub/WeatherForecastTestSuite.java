package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {

    @Test
    void testCalculateForcastWithStub(){
        Temperatures temperatures = new TemperaturesStub();
        WeatherForcast weatherForcast = new WeatherForcast(temperatures);

        int quantityOfSensors = weatherForcast.calculateForcast().size();

        Assertions.assertEquals(5, quantityOfSensors);
    }
}
