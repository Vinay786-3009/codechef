import java.util.*;
import java.lang.*;
import java.io.*;
class inputformat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int roundedCost = ((X + 5) / 10) * 10;
            int amountReturned = 100 - roundedCost;

            System.out.println(amountReturned);
        }

        scanner.close();
    }
}
