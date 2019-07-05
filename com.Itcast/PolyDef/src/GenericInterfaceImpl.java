public class GenericInterfaceImpl implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
