//Alexander Arteaga
// lab 11
import java.util.Scanner;
public class lab11{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int array1[] = new int[50];
        int array2[]= new int [50] ;
        
        for(int i=0; i<50;i++){
           
            array1[i] = (int) (Math.random()*(101)) ; 
            
            
        }// end for loop
        
        int number= 0;
        for(int d=0; d<50;d++){
             number += (int) (Math.random()*(101));
            array2[d] =  number ; 
            
            
        }// end for loop
        
        int max1 = 0;
            for (int j=1; j<array1.length; j++){
                if (array1[j] > array1[max1]) {
                    max1=j;
                }
            }
            System.out.println("Max of first array = "+array1[max1]);
            int min1 = 0;
            for (int k=1; k<array1.length; k++){
                if(array1[k]<array1[min1]){
                    min1 = k;
                }
            }
            System.out.println("Min of first array = "+array1[min1]);
            
        
          int max2=0;
          int min2 = 0;
          for (int a=1; a<array2.length; a++){
                if (array2[a] > array2[max2]) {
                    max2=a;
                }
            }
          System.out.println("Max of second array = "+array2[max2]);
          for (int b=1; b<array2.length; b++){
                if(array2[b]<array2[min2]){
                    min2 = b;
                }
            }
            System.out.println("Min of second array = "+array2[min2]);
           System.out.println(" Enter an int greater than or equal to 0: ");
           if(scan.hasNextInt()){
               int input = scan.nextInt();
               if(input>=0){
                   int upper2 = max2;
                   int lower2 = min2;
                   int middle2 = (max2+min2)/2 ;
                  while((array2[middle2]!= input)&&(lower2<=upper2)) {
                      if (array2[middle2]>input){
                          upper2= middle2 -1;
                      }
                      else{
                          lower2= middle2+1;
                      }
                      middle2 = (upper2+lower2)/2 ;
                  
                  }
                  if(array2[upper2]==array2[lower2]){
                      System.out.println("Input "+input+" was found");
                  }
                  else{
                      System.out.println("Input was not found");
                      System.out.println("The upper key is "+array2[lower2]);
                      System.out.println("The lower key is "+array2[upper2]);
                  }
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
               }
               else{
                   System.out.println("You did not input an integer greater than 0 ");
               }
           }
           else {
               System.out.println (" You did not enter an integer");
           }
    
    
    
    
     }  
}// end of class