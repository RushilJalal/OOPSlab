import java.util.*;
public class SwapElements {
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArr = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array: " + Arrays.toString(intArr));
        swap(intArr, 1, 3);
        System.out.println("Array after swapping elements at indices 1 and 3: " + Arrays.toString(intArr));
    }
}
