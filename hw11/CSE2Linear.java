// Alexander Arteaga
// in this program 15 final grades will be entered. The integers must be inputed
// in increasing order into an array. Then the user will be asked to input a grade to be found and
//  if it is found, it will print out the number of iterations 
// lastly the array will be scrambled and searched again.
import java.util.Scanner;
import java.util.Random;
public class CSE2Linear {
    public static void main(String[] args){
        
        int[] grades = new int[16]; // so 15 integers are entered (I'm making the first spot [1] not [0])
        int newgrades[];
        int scrambled[];
        newgrades = checker(grades);
         System.out.println("The grades, sorted, are: ");
         for (int k=1; k<16;k++){ // in order to print out the grades entered
            
            System.out.print(" "+newgrades[k]);
        } 
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade to search for:");
        int grade = scan.nextInt(); // asking user for the grade to search
        String iteration= binarysearch(newgrades, grade);
        System.out.println(iteration);
        
        scrambled = scrambler(newgrades);
        
        System.out.println("Scrambled:");
        for (int a=1; a<16;a++){ // in order to print out the scrambled grades 
            
            System.out.print(" "+scrambled[a]);
        }
        System.out.println();
        System.out.println("Enter a grade to search for:");
        int grade1 = scan.nextInt(); // asking user for the grade to search
         String iteration1= linearsearch(scrambled, grade1);
        System.out.println(iteration1);
        
    }// end of main method
    
    public static int[] checker(int fill[]){
        fill = new int[16];
        System.out.println("Enter 15 final CSE2 grades in increasing order:");
        for(int i=1;i<16;){
        Scanner scan = new Scanner(System.in);
        
        if(scan.hasNextInt()){
            int number = scan.nextInt();
            if((number>=0)&&(number<=100)){
                if(i==1){
                    fill[i]= number;
                    i++;
                }
                else if (i>1){
                    fill[i] = number;
                    if(fill[i]>=fill[i-1]) {
                        i++;
                    } // to make sure ints are entered in increasing order
                    else{
                        System.out.println("You didn't enter a integer greater than or equal to the last one! Try again");
                    }
                    
                }
                
            } // end of interval if checker
            else{
                System.out.println("You didn't enter an int between 0-100 try again!");
            }
            
        } // end of if int checker
        else{
            System.out.println("You didn't enter an int try again!");
        }
        }// end of for loop
        return fill;
    }// end of linear method
    
    
    public static String binarysearch(int array2[], int item){
        String hey = " ";
                   int i =0;
                   int upper2 = 15;
                   int lower2 = 1;
                   int middle2 = (upper2+lower2)/2 ;
                  while((array2[middle2]!= item)&&(lower2<=upper2)) {
                      if (array2[middle2]>item){
                          upper2= middle2 -1;
                      }
                      else{
                          lower2= middle2+1;
                      }
                      middle2 = (upper2+lower2)/2 ;
                   i ++; // for counting iterations
                  }
                  if(array2[upper2]==array2[lower2]){
                      hey =(item+" was found with "+i+" iterations.");
                  }
                  else{
                       hey =(item+" was not found with "+i+" iterations.");
                  }
                  return hey;
    }// end of binary search
    
    public static int[] scrambler(int list[]){
        Random ran = new Random();
        for (int i=1; i<list.length; i++) {
	//find a random member to swap with
	
	int target = (ran.nextInt(15))+1;


	
	int temp = list[target];
	list[target] = list[i];
	list[i] = temp;
        } // end of for loop
        
        
        
        return list;
    } // end of scrambler
    
    public static String linearsearch(int array1[], int number1 ){
        String ok = " ";
        for(int b=1; b<16; b++){
            if(array1[b]==number1){
                ok= (number1+" was found with "+b+" iterations.");
                break;
            }
            else{
                ok = (number1+" was found with "+b+" iterations.");
            }
        }
        
        return ok;
    } // end of linearsearch
    
    
    
    
} // end of class