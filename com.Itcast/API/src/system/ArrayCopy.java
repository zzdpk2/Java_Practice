package system;

import java.util.Arrays;

public class ArrayCopy{

    // copy the first 3 elements in src array to dest dest array
    // src [1, 2, 3, 4, 5], dest [6, 7, 8, 9, 10]
    // result: dest [1, 2, 3, 9, 10]

    public static void main(String[] args) {
        int[] src_array = {1, 2, 3, 4, 5};
        int[] dest_array = {6, 7, 8, 9, 10};

        System.arraycopy(src_array, 0, dest_array, 0, 3);

        System.out.println("dest_array: " + Arrays.toString(dest_array));

    }

}
