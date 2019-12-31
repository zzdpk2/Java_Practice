package practice2;

public class Entrance {
    public static void main(String[] args) {
//        invokeCalc(10, 20, (int a, int b) -> {
//            return a + b;
//        });
        invokeCalc(10, 20, (a, b) -> a + b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator){
        System.out.println("Result is : " + calculator.calc(a, b));
    }
}
