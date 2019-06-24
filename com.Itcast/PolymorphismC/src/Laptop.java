public class Laptop {

    public void powerOn(){
        System.out.println("Power on!");
    }

    public void powerOff(){
        System.out.println("Power off!");
    }

    public void useDevice(USB usb){
        usb.turnOn();
        usb.turnOff();
    }
}
