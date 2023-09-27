package com.workintech.Pasific;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        setEngine(true);
        setWheels(4);
    }


    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }



    public String startEngine() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return "the car is braking";
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Cylinders: " + cylinders + "\n");
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }
}
