package org.example;

public class Main {
    public static void main(String[] args) {
        Car validCar = new Car(4, 3, true, true);
        Car invalidCar = new Car(4, 4, true, true);
        CarInspectionService carInspectionService = new CarInspectionService();
        System.out.println(carInspectionService.checkCar(validCar));
        System.out.println(carInspectionService.checkCar(invalidCar));

    }
}