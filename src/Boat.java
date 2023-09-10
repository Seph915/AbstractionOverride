public class Boat extends Vehicle{

    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(String type, int numberOfWheels, double maxSpeed, int weight){
        super(type, numberOfWheels);
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public String getBoatWeightAndSpeed(){
        return String.format("Peso totale: %d \nVelocità massima: %.1f", boatKilosWeight, maxKnotsSpeed);
    }

    @Override
    void doVehicleSound() {
        System.out.println("Boat sound");
    }
}
