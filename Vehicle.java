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

class Car extends Vehicle{
    private final String gear;
    private final String type;
    Car(String make, String plate, String color, String category, String gear, String type){
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    public String getGear(){
        return this.gear;
    }

    public String getType(){
        return this.type;
    }

    public String toString(){
        return "Make: " + super.getMake() + "||" +
                "Plate: " + super.getPlate() + " || " +
                "Color: " + super.getColor() + " || " +
                "Category: " + super.getCategory() + " || " +
                "Gear: " + this.getGear() + " || " +
                "Type: " + this.getType();
    }
}

class Motorcycle extends Vehicle{
    private final boolean hasSideCar;

    Motorcycle(String make, String plate, String color, String category, boolean hasSideCar){
        super(make, plate, color, category);
        this.hasSideCar = hasSideCar;
    }

    public boolean hasSideCar(){
        return  this.hasSideCar;
    }

    public String toString(){
        return "Make: " + super.getMake() +
                "Plate: " + super.getPlate() +
                "Color: " + super.getColor() +
                "Category: " + super.getCategory() +
                "Side Car: " + this.hasSideCar;
    }
}
