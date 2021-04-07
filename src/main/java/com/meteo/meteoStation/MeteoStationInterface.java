package com.meteo.meteoStation;

import com.meteo.displayMode.UserInterface;

public interface MeteoStationInterface {
    public void addUser(UserInterface userInterface);
    public void deleteUser(UserInterface userInterface);
    public void notifyUsers();
}
