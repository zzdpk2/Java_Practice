public class InstanceOf {
    public static void main(String[] args) {
        Animal animal = new Cat(); //it was a cat
        animal.eat();

        // If you want to call the exclusive methods in subclass, you have to cast the current class to subclass.
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watch();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(new Dog());

    }

    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watch();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

    }
}
