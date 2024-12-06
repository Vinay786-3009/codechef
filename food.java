import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class food {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            double onlineCost = N * 0.90;
            if (onlineCost < M) {
                System.out.println("ONLINE");
            } else if (onlineCost > M) {
                System.out.println("DINING");
            } else {
                System.out.println("EITHER");
            }
        }

        scanner.close();
    }
} 
