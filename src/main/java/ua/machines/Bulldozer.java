package ua.machines;

public class Bulldozer extends Machine {
    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped to work");
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
