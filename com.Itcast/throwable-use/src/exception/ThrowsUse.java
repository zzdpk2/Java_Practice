package exception;

public class ThrowsUse {

    public static void main(String[] args) {
        int[] arr = null;
        int v = getElement(arr, 0);
        System.out.println(v);
    }

    public static int getElement(int[] arr, int index){

        if(arr == null) throw new NullPointerException("The array is not valid!");

        if(index < 0 || index > arr.length - 1)
            throw new ArrayIndexOutOfBoundsException("The index of array is out of bound!");

        return arr[index];

    }
}
