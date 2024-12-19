import java.util.*;

public class Ifelse{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        int number = sc.nextInt();

        Scanner scan = new Scanner(System.in);
        int number2 = scan.nextInt();

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter a character: ");
        // char check = sca.next(".").charAt(0);
// **Easy (10 Questions)**

// 1. Check if a Number is Positive or Negative
// Input:  
// -5
// Output:  
// The number is negative.

// if(number < 0){
// System.out.println("Ther number is negative");
// }else{
//     System.out.println("Ther number is positive");
// }


// 2. Check if a Number is Even or Odd
// Input:  
// 7
// Output:  
// 7 is odd.
    // if(number % 2 == 0){
    //     System.out.println(number + "is even");
    // }else{
    //     System.out.println(number + " " +"is odd");
    // }

// 3. Check if a Character is a Vowel or Consonant
// Input:  
// e
// Output:  
// e is a vowel.

// if(check == "a" && check == "e" && check == "i" && check == "o" && check == "u"){
//     System.out.println(check + " " +"is a vowel");
// }else{
//     System.out.println(check + " " + "is a consonant");
// }


// 4. Find the Maximum of Two Numbers
// Input:  
// 5, 8
// Output:  
// 8 is larger than 5.
// if(number > number2 ){
//     System.out.println(number + " " + "is larger than" + " " + number2);
// }else{
//     System.out.println(number2 + " " + "is larger than" + " " + number);
// }

// 5. Grade Evaluation
// Input:  
// 85
// Output:  
// Grade B

// if(number > 90){
//     System.out.println("Grade A");
// }else if(number > 80){
//     System.out.println("Grade B");
// }else{
//     System.out.println("Grade C");
// }


// 6. Find if a Number is Divisible by 3
// Input:  
// 9
// Output:  
// 9 is divisible by 3.

// if(number % 3 == 0){
//     System.out.println(number + "is divisible by 3");
// }else{
//     System.out.println(number + "is not divisible by 3");
// }


// 7. Check if a Number is Zero
// Input:  
// 0
// Output:  
// The number is zero.

// if(number == 0){
//     System.out.println("The number is zero");
// }else{
//     System.out.println("The number not is zero");
// }

// 8. Check if a Character is Uppercase or Lowercase
// Input:  
// A
// Output:  
// A is uppercase.+

// if(Character.isUpperCase(check)){
//     System.out.println("Character is in Uppercase!");
// }else{
//     System.out.println("Character is in Lowercase!");
// }



// 9. Find the Smallest of Two Numbers
// Input:  
// 6, 3
// Output:  
// 3 is smaller than 6.



// 10. Check if a Number is Greater Than 100
// Input:  
// 150
// Output:  
// The number is greater than 100.

// if(number > 100){
//     System.out.println("The number is greater than 100.");
// }else{
//     System.out.println("The number is smaller than 100.");
// }


// **Medium (10 Questions)**

// 11. Leap Year Check
// Input:  
// 2024
// Output:  
// 2024 is a leap year./
// if((number % 4 == 0  && number % 100 != 0) || number % 400 == 0){
//     System.out.println(number + "is a leap year");
// }else{
//     System.out.println(number + "is not a leap year");
// }

// 12. Check if a Number is Divisible by 5 and 10
// Input:  
// 50
// Output:  
// The number is divisible by both 5 and 10.
// if(number % 2 == 0 && number2 % 2 == 0){
//     System.out.println("The number is divisible by both 5 and 10");
// }else{
//     System.out.println("The number is not divisible by both 5 and 10");
// }


// 13. Age Classification
// Input:  
// 25
// Output:  
// Adult

// 14. Grade Classification
// Input:  
// 72
// Output:  
// Grade C

// 15. Check if a Number is Prime
// Input:  
// 11
// Output:  
// 11 is a prime number.
if(number < 1){
    System.out.println(number + "Is Not A Prime Number");
}else{
    boolean isPrime = true; 

    for(int i = 2; i<= number; i++){
        if(number % 2 == 0){
            isPrime = false;
            break;
        }
    }
    if(isPrime){
        System.out.println("is prime");
    }else{
        System.out.println("is not prime"); 
    }
}


// 16. Check if a Number is a Multiple of 7
// Input:  
// 49
// Output:  
// 49 is a multiple of 7.

// 17. Find the Largest of Three Numbers
// Input:  
// 5, 12, 9
// Output:  
// 12 is the largest number.

// 18. Temperature Conversion (Celsius to Fahrenheit)
// Input:  
// 35
// Output:  
// It's a normal temperature.

// 19. Check if a Person is Eligible to Vote
// Input:  
// 20
// Output:  
// You are eligible to vote.

// 20. Check if a Number is Between Two Numbers
// Input:  
// 15
// Output:  
// The number is between 10 and 20.


// **Hard (10 Questions)**

// 21. Check if a Number is a Palindrome
// Input:  
// 121
// Output:  
// 121 is a palindrome.

// 22. Check if a Number is Armstrong
// Input:  
// 153
// Output:  
// 153 is an Armstrong number.

// 23. Find the Greatest of Three Numbers
// Input:  
// 10, 25, 5
// Output:  
// 25 is the greatest number.

// 24. Check if a Number is a Perfect Number
// Input:  
// 28
// Output:  
// 28 is a perfect number.

// 25. Check if a Number is a Fibonacci Number
// Input:  
// 21
// Output:  
// 21 is a Fibonacci number.

// 26. Find the Middle Number of Three
// Input:  
// 5, 10, 3
// Output:  
// 5 is the middle number.

// 27. Check if Two Numbers are Coprime
// Input:  
// 8, 15
// Output:  
// 8 and 15 are coprime.

// 28. Check if a Year is a Leap Year (Advanced Logic)
// Input:  
// 2000
// Output:  
// 2000 is a leap year.

// 29. Check if a Number is a Power of 2
// Input:  
// 16
// Output:  
// 16 is a power of 2.

// 30. Determine if a String is a Palindrome
// Input:  
// madam
// Output:  
// madam is a palindrome.

    }
}

