import java.util.Scanner;

public class array {
   public static void main(String[] args) {
        int[] arr = new int[5];   // create an integer array of length 5
        int size = 5;             // set size of array to 5
        Scanner inp = new Scanner(System.in);  // create scanner object to read user input
        System.out.println("enter data :");   // prompt user to enter data
        for(int j = 0; j < size; j++) {        // read input values and store them in the array
            arr[j] = inp.nextInt();
        }
        System.out.println("Your data is :"); // print out the entered data
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println(" enter the index value : "); // prompt user to enter an index value
        int indes = inp.nextInt();                      // read index value from user
        
        System.out.println("enter the value : ");  // prompt user to enter a value
        int valu = inp.nextInt();                 // read value from user
        
        size++;  // increase the size of the array
        
        for(int k = size; k > indes; k--) {  // shift all elements to the right of the given index to the right
            arr[k] = arr[k-1];
        }
        arr[indes] = valu;  // insert the new value at the given index
        System.out.println(" output");   // print out the updated array
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
   }
}
