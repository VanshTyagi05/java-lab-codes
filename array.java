import java.util.Scanner;
public class array {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = scanner.nextInt();
    int[] array = new int[size];
    System.out.println("Enter elements of array:");
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }
    System.out.println("Array elements:");
    for (int i = 0; i < size; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
