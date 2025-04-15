import java.util.Arrays;

public class ArrayInsert {
    public static int[] insert(int[] arr, int index, int value) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }
        result[index] = value;
        for (int i = index; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] inserted = insert(original, 2, 99);
        System.out.println(Arrays.toString(inserted)); // [1, 2, 99, 3, 4]
    }
}
