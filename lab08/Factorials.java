//Alexander Arteaga
// lab 08 factorials

import java.util.Scanner;
public class Factorials {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a positive number to find the super Factorial of:");
        int sup = scan.nextInt(); // to obtain the user input
       if(sup>=0){ // to make sure the user inputed a positive number
        int sum = 0; // int sum to calculate the factorial
        for(int i = 1; i <= sup; i++){ // for loop for adding up factorial
            sum += factorial(i);  
        }
        print(sum);
       }
       else{
           System.out.println("You didn't type a positive number"); // if user inputs a negative number
       }
  } // end of main method
    public static int factorial(int key){
        
        int a = 1;
        for (int i = 1; i <= key; i++){
            a*= i;
        }
        
        return a;
    } // end of factorial method
    public static void print(int answer){
       
        System.out.println("The super factorial is equal to " + answer);
    } // end of print method
} // end of class
