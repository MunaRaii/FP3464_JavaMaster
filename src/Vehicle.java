class Vehicle {
    private final String make;
    private final String plate;
    private final String color;
    private final String category;

    protected final String vehicleType;

    public Vehicle(String make, String plate, String color, String category, String vehicleType) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
        this.vehicleType = vehicleType;
    }

    public String getMake() {
        return this.make;
    }

    public String getPlate() {
        return this.plate;
    }

    public String getColor() {
        return this.color;
    }

    public String getCategory() {
        return this.category;
    }


}

class Car extends Vehicle {
    private final String gear;
    private final String type;

    public Car(String make, String plate, String color, String category, String gear, String type) {
        super(make, plate, color, category, "car");
        this.gear = gear;
        this.type = type;
    }

    public String getGear() {
        return this.gear;
    }

    public String getType() {
        return this.type;
    }

    public String toString(){
        return "-make: " + super.getMake() + " \n " +
                " -Plate: " + super.getPlate() + " \n " +
                " -Color: " + super.getColor() + " \n " +
                " -Category: " + super.getCategory() + "\n " +
                " -Gear: " + this.getGear()  + " \n "+
                " -Type: " + this.getType();

    }
}

class Motorcycle extends Vehicle {
    private final boolean hasSidecar;

    public Motorcycle(String make, String plate, String color, String category, boolean hasSidecar) {
        super(make, plate, color, category, "bike");
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return this.hasSidecar;
    }

    public String toString(){
        return "  -make: " + super.getMake() + " \n " +
                " -Plate: " + super.getPlate() + " \n " +
                " -Color: " + super.getColor() + " \n " +
                " -Category: " + super.getCategory() + "\n " +
                " -Side Car: " + this.hasSidecar;

    }
}


