public class InterfaceDefaultA implements InterfaceDefaultPrac{

    @Override
    public void methodAbs() {
        System.out.println("Executed abstract method!");
    }

    @Override
    public void methodDefault() {
        System.out.println("The methodDefault is override by new class!");
    }
}
