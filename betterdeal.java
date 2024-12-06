import java.util.*;
import java.lang.*;
import java.io.*;


import java.util.Scanner;

class betterdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            double price1 = 100;
            double price2 = 200;
            double finalPrice1 = price1 - (price1 * A / 100);
            double finalPrice2 = price2 - (price2 * B / 100);
            if (finalPrice1 < finalPrice2) {
                System.out.println("FIRST");
            } else if (finalPrice1 > finalPrice2) {
                System.out.println("SECOND");
            } else {
                System.out.println("BOTH");
            }
        }

        scanner.close();
    }
}