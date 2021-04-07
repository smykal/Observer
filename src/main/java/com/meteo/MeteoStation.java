package com.meteo;

import com.meteo.displayMode.CurrentWeatherCondition;
import com.meteo.displayMode.DisplayInterface;
import com.meteo.meteoStation.MeteoData;

public class MeteoStation {
    public static void main(String[] args) {
        MeteoData meteoData = new MeteoData();

        DisplayInterface currentWeatherCondition = new CurrentWeatherCondition(meteoData);

        meteoData.setData(25,1052,72);
        meteoData.setData(27,1035,76);
        meteoData.setData(19,1064,78);
    }
}
