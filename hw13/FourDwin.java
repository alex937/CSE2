// Alexander Arteaga
// last hw  for cse2
// Hw 13 FourDwin
import java.util.Random;
import java.util.Scanner;
public class FourDwin{
    public static void main(String[] args){
        int X =0;
        int Y=0;
        int i =0;
        System.out.println("Enter an integer X: ");
        while(i<1){
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()){
                 X = scan.nextInt();
                if(X>0){
                    i++;
                }
                else{
                    System.out.println("Inputed integer is not valid.Try again for X:");
                }
            } // end of if 
            else{
                System.out.println(" You did not enter an integer. Try again for X:");
                
            }
        } // end of while loop for X
        System.out.println("Enter an integer Y such that Y>X:");
        int j=0;
        while(j<1){
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()){
                 Y = scan.nextInt();
                if(Y>X){
                    j++;
                }
                else{
                    System.out.println("Invalid input. Please enter an integer Y such that Y>X:");
                }
            } // end of if 
            else{
                System.out.println(" You did not enter an integer. Try again for Y:");
            }
            
        } // end of second while loop for Y
         Random ran = new Random();
         int q = (ran.nextInt(Y-X+1)+X);
         int w = (ran.nextInt(Y-X+1)+X);
         int e = (ran.nextInt(Y-X+1)+X);
        double[][][][] array = new double[3][q][w][e];
        
        for(int a =0;a<3;a++){ // for loop to create the 4d matrix
          for(int b=0; b<q;b++){
            for(int c=0; c<w;c++){
                for(int d=0;d<e;d++){
            double number = (ran.nextDouble()*30.0); // in order to print a number between -10 and 10. 
            array[a][b][c][d]= number;
                }
              }
            }
        } // end of for loop to make 4d matrix
        System.out.println("Original Array:");
        printArray(array);
        System.out.println("Sorted Array:");
        double[][][][] newarray;
        newarray = sort4DArray(array);
        printArray(newarray);
        System.out.println();
        statArray(newarray);
        
        
        
        
        
        
    }// main method
     
     public static void printArray(double[][][][] test){
        
        System.out.print("{");
       for (int d = 0; d < test.length; d++) {
            System.out.print("{");
         for (int f = 0; f< test[d].length; f++) {
             System.out.print("{");
             for (int a = 0; a < test[d][f].length; a++) {
                 System.out.print("{");
                 for (int b = 0; b< test[d][f][a].length; b++) {
         System.out.printf("%1$.1f", test[d][f][a][b]);
           System.out.print(", ");
                 }
             System.out.print("}");
                 } 
            System.out.print("}");
                 }
             System.out.print("}, ");
        }
        System.out.print("}");
        System.out.println();
        
        
        
   } // end of printmatrix method
   
   public static double[][][][] sort4DArray(double[][][][] array) {
    for (int i = 1; i < array.length; i++) { 
        for (int j = i-1; j >= 0; j--) { 
            if (array[j].length > array[j+1].length) { 
                double[][][] temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } // end of if
           else if(array[j].length == array[j+1].length){
               array[j] = sort3DArray(array[j]); 
           } // end of else if 
        } 
     }
    return array;
    } // end of sort4dArray
   
   
   public static double[][][] sort3DArray(double[][][] array){
      
	for(int i = array.length - 1; i >= 0; i--){	
		int max = i;			
		for(int j = i; j >= 0; j--){
			if((array[j].length) > (array[max].length)){	
				max = j;	
			}// end of if
		}// end of nested for loop
		double[][] temp = array[i];
		array[i] = array[max];
		array[max] = temp;
	}
	return array;

   }// end of 3d sort
   
    public static void statArray(double[][][][] array){
                int number1 = 0; // number of members in array
                double sum1 = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        for (int k = 0; k < array[i][j].length; k++) {
                            for (int l = 0; l < array[i][j][k].length; l++) {
                                   sum1 += array[i][j][k][l];
                                    number1++;
                            } // last for loop end
                         }// third for loop end
                               
                      } // second for loop end
                    }// first for loop end
                    System.out.println();
                System.out.println("Members: " + number1);
                System.out.println();
                System.out.print("Sum: ");
                System.out.printf("%1$.1f", sum1);
                System.out.println();
                System.out.print("Mean: ");
                System.out.printf("%1$.1f", (sum1/number1));
                System.out.println();
                
    } // end of stats
    
    
} // end of class