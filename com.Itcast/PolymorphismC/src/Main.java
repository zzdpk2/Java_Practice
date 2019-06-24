public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();

//        Mouse mouse = new Mouse();
//        USB usb = mouse;

        USB usbMouse = new Mouse();
        laptop.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        laptop.useDevice(keyboard); // cast to parent class
        laptop.useDevice(new Keyboard()); //cast to a parent class via an anonymous class

        method(10.0);  // double --> double
        method(10); // int --> double

        int a = 30;
        method(a);  // int --> double

        laptop.powerOff();
    }

    public static void method(double num){
        System.out.println(num);
    }

}
