public interface InterfaceDefaultPrac {
    public abstract void methodAbs();
//    public abstract void methodsAbs2();
//    default method

    public default void methodDefault(){
        System.out.println("New default method!");
    }

}
