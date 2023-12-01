public class Vehicle {
    private final String make;
    private final String plate;
    private final String color;
    private final String category;

    Vehicle(String make, String plate, String color, String category){
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    public String getMake(){
        return this.make;
    }

    public String getPlate(){
        return this.plate;
    }

    public String getColor(){
        return this.color;
    }

    public String getCategory(){
        return this.category;
    }

}
