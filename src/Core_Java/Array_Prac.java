package Core_Java;

public class Array_Prac {
	//Finding smallest no. in array
    public static void main(String[] args) {
        int array[] = {10, 20, 25, 63, 96, 57};
        int smallest = findSmallestElement(array);
        System.out.println("Smallest element in the array is: " + smallest);
    }

    public static int findSmallestElement(int array[]) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}
