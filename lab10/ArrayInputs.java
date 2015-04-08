// Alexander Arteaga
// lab 10
// In this lab we will make a one dimensional array but asking the user for the size and the numbers in the array
import java.util.Scanner;
public class ArrayInputs {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer for the size of the array:");
        int[] array;
        int number = scan.nextInt();
        array = new int [number];
        System.out.print("Please enter positive integers for the array:");
        for(int i=0; i<number;i++){
           
            array[i] = checker(i); 
            
            
        }// end for loop
        System.out.println("Your array is:");
        for (int k=0; k<number;k++){
            
            System.out.println(array[k]);
        } 
        
        
        
        
        
    } // end of main method
    
    
    public static int checker(int key){
        
        int positive=0; 
        
        for(int j=0;j<1;){
        
        Scanner myscanner = new Scanner(System.in);
        if(myscanner.hasNextInt()){ 
            
            positive =myscanner.nextInt();
            if (positive >=0){
                
                j++;
            }
            else{
                System.out.println("Try again, you entered a negative int:");
            }
        }
        else{ System.out.println ("Try again, you entered a non integer:");
        
        }
        
        } 
        
        return positive;
    }// end of positive input checker
    


}// end of class