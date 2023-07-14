import java.util.Arrays;

public class ArrayRotation {
    public static int[] rotateArray(int[] arr, int rotationCount) {
        int n = arr.length;
        int[] rotatedArray = new int[n];
        
        // Adjust rotation count to avoid unnecessary rotations
        rotationCount %= n;
        
        // Copy the rotated elements to the new array
        System.arraycopy(arr, n - rotationCount, rotatedArray, 0, rotationCount);
        System.arraycopy(arr, 0, rotatedArray, rotationCount, n - rotationCount);
        
        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int rotationCount = 2;
        
        int[] rotatedArray = rotateArray(inputArray, rotationCount);
        System.out.println("Input: " + Arrays.toString(inputArray));
        System.out.println("Output: " + Arrays.toString(rotatedArray));
    }
}