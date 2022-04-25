package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);

        plane.onboard("Tommy");
        plane.onboard("Gilly");
        plane.onboard("Molly");
        plane.onboard("Jolly");
        plane.onboard("Ramel");
        plane.onboard("Styu");

        System.out.println("The takeOff Time is: " +plane.takeOff());

        System.out.println("The passengers are: " +plane.getPassengers());
        Thread.sleep(5000);

        plane.land();
        System.out.println("The Landing Time is: " +plane.getLastTimeLanded());






    }
}
