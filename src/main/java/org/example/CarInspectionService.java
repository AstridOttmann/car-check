package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarInspectionService {
   // private List<Car> carChecks;

    public boolean checkTires(Car testCar) {
        return testCar.getNumberOfTires() == 4;
    }

    public boolean checkSeatBelt(Car testCar) {
        return testCar.getSeatBelt();
    }

    public boolean checkAirbag(Car testCar) {
        return testCar.getAirbag();
    }

    public boolean checkNumberOfDoors(Car testCar) {
        return testCar.getNumberOfDoors() == 3 || testCar.getNumberOfDoors() == 5;
    }

    public boolean checkCar(Car testCar) {
        return checkTires(testCar) && checkNumberOfDoors(testCar)
                && checkSeatBelt(testCar) && checkAirbag(testCar);
    }

}

