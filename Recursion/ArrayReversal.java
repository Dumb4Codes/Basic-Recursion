public class ArrayReversal {
    public static void main(String[] args) {
        /* 
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("The original array of course: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.println("The reverse array: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        */

        //--------------- Using Recursion-----------------

        int[] arr = {1, 2, 3, 4, 5, 6};
        
        System.out.println("The original array of course: ");
        printArray(arr);

        reverseArray(arr, 0, arr.length-1);

        System.out.println("\nThe reverse array: ");
        printArray(arr);
    }

    private static void reverseArray(int[] arr, int start, int end) {

        if (start >= end) {
            return; // Base case: Stop recursion when start >= end
        }
        
        // Swap the elements at start and end positions
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        // Recursive call to reverse the remaining subarray
        reverseArray(arr, start + 1, end - 1);
    }

    private static void printArray(int[]  arr) {

        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
