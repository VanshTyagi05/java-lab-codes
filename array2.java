import java.util.Scanner;
public class array2 {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the rows of the array: ");
    n = scanner.nextInt();
    int m;
    System.out.print("Enter the cols of array : ");
    m = scanner.nextInt();
    int[][] arr = new int[n][m];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scanner.nextInt();
      }
    }
    System.out.println("The entered array is:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }
}
