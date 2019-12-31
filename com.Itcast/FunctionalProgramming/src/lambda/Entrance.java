package lambda;

public class Entrance {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("Eat!");
            }
        });

//        invokeCook(() -> {
//            System.out.println("Eat!");
//        });

        invokeCook(() -> System.out.println("Eat!"));

    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }

}
