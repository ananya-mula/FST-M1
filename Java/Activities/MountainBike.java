package activities;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gears, int currentSpeed, int startHeight){
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed + "\nSeat Height of bicycle is " + seatHeight);
    }



}
