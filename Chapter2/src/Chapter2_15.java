public class Chapter2_15 {
    public static void main(String[] args) {
        double base = 100.0;
        double rate = 0.05/12;
        int month = 6;
        double result = 0;
        for(int i = 1; i <= 6; i++)
            result = base * Math.pow((1 + rate), month);
        System.out.println("Result: " + result);
    }
}
