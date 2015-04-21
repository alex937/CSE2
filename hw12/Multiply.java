//Alexander Arteaga
// hw 12 Multiply!
// in this hw we are multipling two matrices using multiple methods. 
import java.util.Scanner;
import java.util.Random;
public class Multiply{
    public static void main(String[] args){
        int height1=0;
        int height2 = 0;
        int width2 =0;
        int width1=0;
        int i= 0;
        while(i<1){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please answer the questions to multiply two matrices:");
        
        
        int j=0;
        while(j<1){
        System.out.println("Enter a width for the matrix 1:");
        if (scan.hasNextInt()){
        width1 = scan.nextInt();
              if(width1<0){
                  System.out.println("You didn't enter a positive integer try again!");
              }
              else{
                  j++;
              }
        }
        else{ System.out.println("You didn't enter an integer try again!");
            
        }
        } // while loop for width 1
        
        int k=0;
        while(k<1){
        System.out.println("Enter a height for the matrix 1:");
        if (scan.hasNextInt()){
         height1 = scan.nextInt();
              if(height1<0){
                  System.out.println("You didn't enter a positive integer try again!");
              }
              else{
                  k++;
              }
        }
        else{ System.out.println("You didn't enter an integer try again!");
            
        }
        } // while loop for height 1
        
        
        
        int l =0;
        while(l<1){
        System.out.println("Enter a width for the matrix 2:");
        if (scan.hasNextInt()){
         width2 = scan.nextInt();
              if(width2<0){
                  System.out.println("You didn't enter a positive integer try again!");
              }
              else{
                  l++;
              }
        }
        else{ System.out.println("You didn't enter an integer try again!");
            
        }
        } // while loop for width 2
        
        
        int a =0 ;
        while(a<1){
         System.out.println("Enter a height for the matrix 2:");
        if (scan.hasNextInt()){
         height2 = scan.nextInt();
              if(height2<0){
                  System.out.println("You didn't enter a positive integer try again!");
              }
              else{
                  a++;
              }
        }
        else{ System.out.println("You didn't enter an integer try again!");
            
        }
        } // while loop for height 2 
        
        
        
        
        
        if(width1 != height2){
            System.out.println("The matrices cannot be multiplied due to dimensions, Try again!");
        }
        else{
            
            
         i++;   
        }
        } // end of while loop for first checker to make sure all entered values are allowable
        int[][] first = randomMatrix(height1,width1);
        int[][] second = randomMatrix(height2, width2);
        System.out.println("Printing random array 1 and 2 ensure it is generated correctly");
        printMatrix(first);
        System.out.println();
        System.out.println();
        printMatrix(second);
        int[][] product = matrixMultiply(first,second);
        System.out.println("Here is the product Matrix:");
        System.out.println(); 
        for (int d = 0; d < product.length; d++) {
         for (int f = 0; f< product[d].length; f++) {
        System.out.print(product[d][f] + " ");
                 }
             System.out.print("\n");
        } // for loop for printing it out
        
    } // end of main method
    
    public static int[][] randomMatrix(int height1, int width1){ // method that recieves two integers and outputs a 2D matrix
        Random ran = new Random();
        int[][] array = new int[height1][width1];
        for(int j =0;j<width1;j++){ // for loop to create the 2d matrix
            
        for(int i=0; i<height1;i++){
            int number = (ran.nextInt(21)-10); // in order to print a number between -10 and 10. 
            array[i][j]= number;
            
            }
        }
        return array; 
         
    } // end randomMatrix method
    public static void printMatrix(int[][] test){
         if(test == null){
            System.out.println("Array is null");
        }
        
       for (int a = 0; a < test.length; a++) {
         for (int b = 0; b< test[a].length; b++) {
        System.out.print(test[a][b] + " ");
                 }
             System.out.print("\n");
        }
        
        
   } // end of printmatrix method
    
     
    
    public static int[][] matrixMultiply(int[][] array2, int[][] array3){
        int[][] answer;
        int width2 = array2[0].length;
        int height2 = array2.length;
        int width3 = array3[0].length;
        int height3 = array3.length;
        if (width2 != height3){ // just in case for bugs
         System.out.println("The Matrices cannot be multiplied"); 
         return null;
        } 
        else{
        answer = new int[height2][width3];
        for (int i = 0; i < height2; i++){ // for loop to multiply the matrices
            for (int j = 0; j < width3; j++){
                for (int k = 0; k < width2; k++){
                    answer[i][j] += (array2[i][k] * array3[k][j]);
                }
            }
        } // end for loop
        return answer;
        }
    } // end of matrix multiply method
    
    
    
} // end of class