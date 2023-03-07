package org.example;

public class CarInspectionService {

    public boolean checkTires(Car testCar){
       return testCar.getNumberOfTires() == 4;
    }

    public boolean checkSeatBelt(Car testCar) {
        return testCar.getSeatBelt();
    }

    public boolean checkAirbag(Car testCar) {
        return testCar.getAirbag();
    }
}
