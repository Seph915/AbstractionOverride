public abstract class Vehicle {

    private String type;
    private int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public void showVehicleDetails(){
        System.out.printf("Tipo di veicolo: %s \nNumero di ruote: %d%n", type, numberOfWheels);
    }

    abstract void doVehicleSound();
}
