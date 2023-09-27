package com.workintech.RD;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String startEngine() {
        System.out.println("Class name: " + getClass().getSimpleName());
        return getName() + " is starting engine";
    }

    public String drive() {
        runEngine(this);
        return getName() + " is driving";
    }

    protected void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof GasPoweredCar) {
            ((GasPoweredCar)carSkeleton).getAvgKmPerLitre();
            System.out.println("The car engine is starting with gas");
        } else if (carSkeleton instanceof HybridCar) {
            ((HybridCar)carSkeleton).getAvgKmPerLitre();
            System.out.println("The car engine is starting with both gas and electricity");
        } else if (carSkeleton instanceof ElectricCar) {
            ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            System.out.println("The car engine is starting with electricity");
        } else {
            System.out.println("Invalid car type");
        }
    }
}
