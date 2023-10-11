package com.aleksei;

public class GasPump {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return fuelLeft >= distanceToPump / mpg;
    }
}
