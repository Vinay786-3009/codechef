import java.util.*;

public class rcbvscsk {
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        if (X - Y >= 18) {
            System.out.println("RCB");
        } else {
            System.out.println("CSK");
        }
    }
}



