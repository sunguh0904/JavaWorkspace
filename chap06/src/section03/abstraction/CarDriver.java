package section03.abstraction;

public class CarDriver {
    private final Car car = new Car();

    public void startUp() {
        car.startUp();
    }

    public void stepAccelerator() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }
}
