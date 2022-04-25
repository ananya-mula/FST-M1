package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car(){
        tyres = 4;
        doors = 4;
    }

    public void displayCharacteristics(){
        System.out.println("Color: " + color +"  Transmission: "+transmission +"  Doors: "+doors + "  Tyres: "+tyres);
    }

    public void accelarate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }
}
