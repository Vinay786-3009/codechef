import java.util.*;
public class existance {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            long X = sc.nextLong();
            long Y = sc.nextLong();
            
            long leftSide = X * X * X * X + 4 * Y * Y;
            long rightSide = 4 * X * X * Y;
            
            if (leftSide == rightSide) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}

