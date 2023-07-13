package Core_Java;

public class Array_Practice {

	public static void main(String[] args) {
		
		        int[] numbers = {4,5,6,7,8};
		        int smallest = findSmallestNumber(numbers);
		        System.out.println("The smallest number is: " + smallest);
		    }

		    public static int findSmallestNumber(int[] arr) {
		        if (arr == null || arr.length == 0) {
		           System.out.println("Array must not be empty");
		        }

		        int smallest = arr[0];  // Assume the first element is the smallest

		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < smallest) {
		                smallest = arr[i];  // Update smallest if a smaller number is found
		            }
		        }

		        return smallest;

	}

}
