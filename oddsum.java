import java.util.*;
import java.lang.*;
import java.io.*;
public class oddsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            boolean isPossible = (A + B) % 2 != 0 || (A + C) % 2 != 0 || (B + C) % 2 != 0;
            
            if (isPossible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    } }

