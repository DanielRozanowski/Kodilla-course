package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForcast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class WeatherForcastTestSuite {

    @Test
    void testCalculateForcastWithMock(){
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        WeatherForcast weatherForcast = new WeatherForcast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForcast.calculateForcast().size();
        
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}
