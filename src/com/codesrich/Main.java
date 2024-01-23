package com.codesrich;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarDealerShip dealership = new CarDealerShip("XYZ Auto", 5);
/// Adding cars to the dealership's stock
        dealership.addCarToStock(new Car("Toyota", 25000.0, EngineType.PETROL));
        dealership.addCarToStock(new Car("Tesla", 75000.0, EngineType.ELECTRIC));
        dealership.addCarToStock(new Car("Honda", 28000.0, EngineType.HYBRID));
        dealership.addCarToStock(new Car("Ford", 32000.0, EngineType.DIESEL));
        dealership.addCarToStock(new Car("Nissan", 22000.0, EngineType.PETROL));
        dealership.addCarToStock(new Car("Chevrolet", 30000.0, EngineType.HYBRID));

        Car myCar = new Car("toyota", 2400,EngineType.PETROL);
        System.out.println(myCar.toString());
        System.out.println(myCar.getManufacturer() + " : Engine Type : " + myCar.getEngineType());
    }
}