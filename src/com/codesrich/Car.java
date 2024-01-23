package com.codesrich;

public class Car {
//    Create a class to represent a car. The car should have properties representing
//    the manufacturer, price, and engine type (eg. petrol, electric, etc).
    private String manufacturer;
    private double price ;

    private EngineType engineType;

    public Car(){};

    public Car(String manufacturer, double price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
