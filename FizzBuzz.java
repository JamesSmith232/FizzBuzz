import java.util.Scanner;

public class FizzBuzz {
    private static final int FIVE = 5;
    private static final int THREE = 3;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int start = 0; 
        int end = 0; 
        
        System.out.println("==================================================================================================================");
        System.out.println("This program will print the Fizzbuzz numbers in the range you decide.");
        System.out.println("FizzBuzz is a list of numbers that change depending on if the number is a multiple of 3, 5, or both");
        System.out.println("==================================================================================================================\n");
        
        System.out.println("What is the number you want to start at: ");
        start = keyboard.nextInt();  
        System.out.println("What is the number you want to end at: ");
        end = keyboard.nextInt();
        System.out.println(""); 
        
        for (int i = start; i <= end; i++) {
            System.out.println("\t\t\t\t\t\t" + i + "  =  "+ calcFizzBuzz(i));
        }
    }
    
    
    public static boolean isDivisble(int number, int divisor) {
        return number % divisor == 0;
    }

    public static String calcFizzBuzz(int num) {
        if(isDivisble(num, THREE) && isDivisble(num, FIVE)) {
            return "FizzBuzz";
        } 
        else if (isDivisble(num, THREE)) return "Fizz";
        else if (isDivisble(num, FIVE)) return "Buzz";
        else return (""+num);
    }  
}
