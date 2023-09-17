import java.util.*;
import java.util.Scanner;


public class IntegerException {
    private Scanner scanner;

    public IntegerException(Scanner scanner){
        scanner = this.scanner;
    }
    
    

    try {
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

    }
    catch (InputMismatchException e)
    {
        System.out.println( "Invaild Input. Please enter an integer Goofy!");
    }

}


