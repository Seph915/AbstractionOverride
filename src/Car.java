public class Car extends Vehicle{

    private int numberOfDoors;
    private double carPrice;

    public Car(String type, int numberOfWheels, int numberOfDoors, double carPrice){
        super(type, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.printf("Numero di porte: %d%n", numberOfDoors);
    }

    @Override
    void doVehicleSound() {
        System.out.println("Car sound");
    }
}
