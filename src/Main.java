public class Main {
    public static void main(String[] args) {

        Car car = new Car("suv",4,5,50000);
        Boat boat = new Boat("Barca a vela", 0, 40.0, 100);

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.doVehicleSound();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
