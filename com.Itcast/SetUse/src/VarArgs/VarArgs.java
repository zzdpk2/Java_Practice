package VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(add_r(3, 4, 5, 6, 7));
        terminated_method();
    }

//    public static void method(int...a, String...b){}

//    public static void method_r(int...a, String b){}

    public static void terminated_method(Object...obj){
        System.out.println(obj);
    }

    // Define a function to sum up unknown integers
    public static int add_r(int...arr){
        int sum = 0;
//        for (int i = 0; i < arr.length; i++)
//            sum += arr[i];
        for (int i : arr)   sum += arr[i];
        return sum;
    }

    // Define a function to calculate the sum of two integers
    public static int add(int a, int b){ return a + b; }

    // Define a function to calculate the sum of three integers
    public static int add(int a, int b, int c){ return a + b + c; }

}
