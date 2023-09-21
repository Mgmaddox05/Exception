import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String integer = "";
        while (!integer.equals("exit"))
        {
            try {
                System.out.print("Enter an integer: ");
                integer = scan.nextLine();
                if (!integer.equals("exit"))
                {
                    int integerTru = Integer.parseInt(integer);
                    factor(integerTru);
                }
                
        
            }
            // When there are more than one possible exception that needs to be caught use the data type "Exception" 
            // Which is a class that covers all of the exceptions possible
            catch (Exception e)
            {
                System.out.println( "Invaild Input. Please enter an integer Goofy!");
            }
    }


    }

    public static void factor(int n) {
        
        
        
        for (int i = 1; i <= n; i++)
         {
            if(n % i == 0)
            {
                System.out.println("A factor of " + n + " is: " + i);
            }
            
        }
       
        
    }
}
