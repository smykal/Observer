package com.meteo.displayMode;

import com.meteo.meteoStation.MeteoStationInterface;

public class CurrentWeatherCondition implements UserInterface, DisplayInterface {
    private float temp;
    private float moisture;
    private float pressure;
    private MeteoStationInterface meteoData;


    CurrentWeatherCondition(MeteoStationInterface meteoData) {
        this.meteoData = meteoData;
        meteoData.addUser(this);

    }

    @Override
    public void updateInfoFromMeteoStation(float temp, float pressure, float moisture) {
        this.temp = temp;
        this.moisture = moisture;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temp);
        System.out.println("Moisture: " + moisture);
        System.out.println("Pressure: " + pressure + "\n");

    }
}
