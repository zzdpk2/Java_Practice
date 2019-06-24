public class Keyboard implements USB{
    @Override
    public void turnOn() {
        System.out.println("Turn on keyboard!");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off keyboard!");
    }
}
