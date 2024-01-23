package com.codesrich;

public class CarDealerShip {
    private String name;
    private int maxCarsOnDisplay;
    private Car[] carsInStock;

    public  CarDealerShip( String name , int maxCarsOnDisplay){
        this.name= name;
        this.maxCarsOnDisplay= maxCarsOnDisplay;
        this.carsInStock = new Car[maxCarsOnDisplay];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNoOfCar() {
        return maxCarsOnDisplay;
    }

    public void setMaxNoOfCar(int maxCarsOnDisplay) {
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }



    public void addCarToStock(Car car) {
        int currentStockSize = getCarsInStockCount();
        if (currentStockSize < maxCarsOnDisplay) {
            carsInStock[currentStockSize] = car;
            System.out.println(car.getManufacturer() + " " + car.getEngineType() + " car added to stock.");
        } else {
            System.out.println("Sorry, the maximum capacity of cars on display has been reached.");
        }
    }

    // Method to get the current count of cars in stock
    public int getCarsInStockCount() {
        int count = 0;
        for (Car car : carsInStock) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }
}
