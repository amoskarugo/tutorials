package OOP.Abstraction;

public class TvRemote extends Tv{
    @Override
    void turnOn() {
        System.out.println("tv is turned on");
    }

    @Override
    void turnOff() {
        System.out.println("tv is turned off");
    }
}
