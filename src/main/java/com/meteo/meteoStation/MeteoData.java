package com.meteo.meteoStation;

import com.meteo.displayMode.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class MeteoData implements MeteoStationInterface {
    private List users;
    private float temp;
    private float moisture;
    private float pressure;

    public MeteoData() {
        users = new ArrayList();
    }

    @Override
    public void addUser(UserInterface userInterface) {
        users.add(userInterface);
    }

    @Override
    public void deleteUser(UserInterface userInterface) {
        int i = users.indexOf(userInterface);
        if (i >= 0) {
            users.remove(i);
        }
    }

    @Override
    public void notifyUsers() {
        for (int i = 0; i < users.size(); i++) {
            UserInterface UserInterface = (UserInterface) users.get(i);
            UserInterface.updateInfoFromMeteoStation(temp,pressure,moisture);
        }
    }
    public void updateData(){
        notifyUsers();
    }
    public void setData(float temp, float pressure,float moisture){
        this.temp = temp;
        this.pressure = pressure;
        this.moisture = moisture;
        updateData();
    }
}
