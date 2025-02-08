import java.util.Scanner;

public class arraymul {
  public static void main(String[] args) {
    // two 2d array multiplication
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the rows of 1st the array: ");
    n = scanner.nextInt();
    int m;
    System.out.print("Enter the cols of 1st  array : ");
    m = scanner.nextInt();
    int[][] arr = new int[n][m];
    System.out.println("Enter the rows of 2nd array : ");
    int row = scanner.nextInt();
    System.out.println("enter the cols of 2nd array : ");
    int col = scanner.nextInt();
    int arr2[][]=new int[row][col];
    if (row != m) {
      System.out.println("Matrix multiplication failed");
      return;
    }

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scanner.nextInt();
      }
    }
    System.out.println("First Matrix : ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println(
      "Enter the elements 2nd of the array:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        arr2[i][j] = scanner.nextInt();
      }
    }

    System.out.println("second Matrix : ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }

    // third array to store the multiplic
    int mul[][] = new int[n][col];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < col; j++) {
        mul[i][j] = 0;
        for (int k = 0; k < m; k++) {
          mul[i][j] += arr[i][k] * arr2[k][j];
        }

      }

    }
    // Printing the resultant matrix
    System.out.println("Resultant Matrix : ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(mul[i][j] + " ");
      }
      System.out.println();
    }

  }
}
