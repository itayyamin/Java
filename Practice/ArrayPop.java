import java.util.Arrays;

public class ArrayPop {
    public static int[] pop(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            result[i - 1] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] popped = pop(original, 1);
        System.out.println(Arrays.toString(popped)); // [1, 3, 4]
    }
}
