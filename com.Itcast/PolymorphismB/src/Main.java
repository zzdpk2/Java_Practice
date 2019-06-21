public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        Cat cat = (Cat) animal;
        cat.catchMouse();

//        No Compiling Error, but will lead to a ClassCastException
//        Dog dog = (Dog) animal;


    }
}
