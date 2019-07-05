public class GenericClassEntrance {

    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("ABC");
        Object name = gc.getName();
        System.out.println(name);

        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);

        Integer name1 = gc2.getName();
        System.out.println(name1);

    }
}
