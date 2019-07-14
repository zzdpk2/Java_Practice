package exception;

public class ExceptionAnalyze {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 0);
        System.out.println(e);

    }

    public static int getElement(int[] arr, int index){ return arr[index]; }

}
