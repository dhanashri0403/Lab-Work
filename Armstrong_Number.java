
import java.util.*;


class ArmstrongNumberChecker {
   
    boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        
        for (; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n); // Add the nth power of each digit
        }

       
        if (result == number)
            return true; 
	else
            return false; 
    }
}

public class Armstrong_Number {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);

       
        ArmstrongNumberChecker armstrongChecker = new ArmstrongNumberChecker();

        System.out.println("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        
        if (armstrongChecker.isArmstrong(number))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

       
    }
}




















