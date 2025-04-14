public class Arrays {
    
    public static void main(String[] args) {
        // Example 1: Array Initialization and Traversing
        initializeAndTraverseArray();

        // Example 2: Popping the Last Element from an Array
        popFromLastElement();

        // Example 3: Adding an Element at the End (Manually Resizing)
        addElementAtEnd();

        // Example 4: 2D Array Initialization and Traversing
        initializeAndTraverse2DArray();

        // Example 5: Sum of Elements in an Array
        sumOfArrayElements();
    }

    /**
     * Example 1: Array Initialization and Traversing
     * 
     * Input: A static array of integers.
     * Behavior: Initializes an array with 5 integers and prints each element.
     * Result: Prints each element of the array one by one.
     */
    public static void initializeAndTraverseArray() {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Example 1: Array Initialization and Traversing:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
        System.out.println();
    }

    /**
     * Example 2: Popping the Last Element from an Array
     * 
     * Input: A static array of integers.
     * Behavior: Removes the last element by creating a new array with one less element.
     * Result: Prints the updated array after popping the last element.
     */
    public static void popFromLastElement() {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Example 2: Popping the Last Element from an Array:");
        int[] newArr = new int[arr.length - 1];
        
        // Copy elements except the last one
        System.arraycopy(arr, 0, newArr, 0, arr.length - 1);

        // Print updated array
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("Element at index " + i + ": " + newArr[i]);
        }
        System.out.println();
    }

    /**
     * Example 3: Adding an Element at the End (Manually Resizing)
     * 
     * Input: A static array of integers.
     * Behavior: Adds a new element to the end of the array by creating a new array with increased size.
     * Result: Prints the updated array after adding an element.
     */
    public static void addElementAtEnd() {
        int[] arr = {1, 2, 3, 4};
        int newElement = 5;
        
        System.out.println("Example 3: Adding an Element at the End:");
        
        // Create a new array with increased size
        int[] newArr = new int[arr.length + 1];
        
        // Copy original elements to the new array
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        
        // Add new element at the end
        newArr[arr.length] = newElement;
        
        // Print updated array
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("Element at index " + i + ": " + newArr[i]);
        }
        System.out.println();
    }

    /**
     * Example 4: 2D Array Initialization and Traversing
     * 
     * Input: A static 2D array of integers.
     * Behavior: Initializes a 2D array with 3 rows and 3 columns, and prints each element.
     * Result: Prints each element of the 2D array.
     */
    public static void initializeAndTraverse2DArray() {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Example 4: 2D Array Initialization and Traversing:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Element at position (" + i + ", " + j + "): " + arr[i][j]);
            }
        }
        System.out.println();
    }

    /**
     * Example 5: Sum of Elements in an Array
     * 
     * Input: A static array of integers.
     * Behavior: Calculates the sum of all elements in the array.
     * Result: Prints the sum of the elements in the array.
     */
    public static void sumOfArrayElements() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        
        System.out.println("Example 5: Sum of Elements in an Array:");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        System.out.println("Sum of elements: " + sum);
        System.out.println();
    }
}
