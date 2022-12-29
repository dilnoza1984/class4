import java.util.*;
class Main {
  public static void main(String[] args) {


    Scanner in =  new Scanner(System.in);
    System.out.println("Enter the number: ");
    int number =  in.nextInt();
    
    // get the first digit

    int firstDigit = number % 10; // 2 // extract the last digit
    int remainingNumber = number / 10; // 585 // get rid of the last digit
   
      // get the second digit

    int secondDigit = remainingNumber % 10; // 5
    remainingNumber = remainingNumber / 10; // 58

    // get the third digit

    int thirdDigit = remainingNumber % 10; //8
    remainingNumber = remainingNumber / 10; 

    // get the fourth digit

    int fourthDigit = remainingNumber % 10; // 5
    remainingNumber = remainingNumber / 10;

    int multiplication = fourthDigit * thirdDigit * secondDigit 
                          * firstDigit;
    int sum = fourthDigit + thirdDigit + secondDigit + firstDigit;
    
       System.out.println(multiplication - sum );

   




  




  }
}