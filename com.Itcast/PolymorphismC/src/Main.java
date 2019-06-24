public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();

//        Mouse mouse = new Mouse();
//        USB usb = mouse;

        USB usbMouse = new Mouse();
        laptop.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        laptop.useDevice(keyboard);


        laptop.powerOff();
    }
}
