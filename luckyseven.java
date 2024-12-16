import java.util.*;
public class luckyseven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 10) {
            System.out.println(s.charAt(6));
        } else {
            System.out.println("Invalid input length");
        }
        
        sc.close();
    }
}


