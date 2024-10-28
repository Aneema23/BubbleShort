package BubbleShort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleShort {
   
  // Perform the bubble sort in descending order
  public static void bubbleSort(int array[]) {
    int n = array.length;
    
    // Loop to access each array element
    for (int i = 0; i < n - 1; i++) {
      // Loop to compare array elements
      for (int j = 0; j < n - i - 1; j++) {
        // Compare two adjacent elements
        // Change < to > to sort in descending order
        if (array[j] < array[j + 1]) {
          // Swapping occurs if elements
          // are not in the intended order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[8];

    // Reading 8 numbers from the user
    System.out.println("Enter 8 numbers:");
    for (int i = 0; i < 8; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println("Unsorted array:");
    printArray(arr);

    // Sorting the array in descending order
    bubbleSort(arr);

    System.out.println("Sorted array (in descending order):");
    printArray(arr);
  }

  // Helper method to print the array
  public static void printArray(int[] array) {
    for (int value : array) {
      System.out.print(value + " ");
    }
    System.out.println();
  }
}
