import java.util.*;
public class minoftwovalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); 
        int Y = sc.nextInt();
        int maxCones = Math.min(X, Y);
        System.out.println(maxCones);
    }
}

// math,min(X,Y); method is used for find minimum values in two values