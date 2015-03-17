//Alexander Arteaga
//hw07
// in this hw we are trying to get an inclusive input between 1 and 30. We will then
// print out a stack of numbers leading up to the number chosen.
// The stacks will be printed out by a for loop, while loop, and do while loop.
import java.util.Scanner; // to allow use of user input
public class waves { // class for every program
    public static void main(String[] args){ // main method
        Scanner myScanner; // calling variable for scanner
        myScanner = new Scanner( System.in ); // this allows you to construct the scanner
        System.out.print("Enter a number between 1 and 30 inclusively to make a stack:");
        if(myScanner.hasNextInt()){ // start of if statement to make sure an integer is inputed
            int input = myScanner.nextInt();
            if(input>=1 && input<=30){ // if statement to make sure value is between 1 and 30
              System.out.println("For loop:");
                for(int i =1; i<=input ; i++){ // first for loop in order to count how many numbers we are using
                    for(int j = 0; j < i; j++){ // second for loop for how many lines for each number ex. (1 has 1 line)
                      if ((i%2)==0){ // to increment even numbers
                        for (int a = 0; a <= j; a++) { // third for loop for how many numbers in a line we are using
                             
                                System.out.print(i); 
                        }// end of third for loop
                                
                      } //end of second if statement  
                      else{ // for odd numbers decrement
                          for (int b = 1; b <=(-1*j+i); b++) { // fourth for loop for how many numbers in a line we are using (odd) (pain to make)
                             
                                System.out.print(i); 
                        }// end of fourth for loop
                      } // end of second else
              System.out.println(); // to go to next line after each line.
                                                
                        
                    }// end of second for loop
                       

                } // end of for loop
                
                
                System.out.println("While loop:");
                 int q=1; // setting variables for while loop
                 while(q<=input){
                     int w=0;
                     while(w<q){
                         if((q%2)==0){
                             int e=0;
                             while(e<=w){
                                 System.out.print(q);
                                 e++;
                             }// end of while
                             
                         } // end of while if statement
                         else{ 
                            int r=1;
                             while(r<=(-1*w+q)){
                                 System.out.print(q);
                                 r++;
                             } // end of else while
                         }// end of else
                         System.out.println(); // to go next line
                         w++;
                          
                     } // end of second while loop
                     
                     q++;
                 } // end of first while loop
                
                
                
                
                
                System.out.println("For do-while loops:");
                 int u=1;
                  do {
                      int l=0;
                      do{
                         if((u%2)==0){
                             int o=0;
                             do{
                                 System.out.print(u);
                                 o++;
                             } while(o<=l); // end of even do while loop
                             
                         } //end of do -while if statement for even numbers
                          else{
                              int p=1;
                              do{
                                  System.out.print(u);
                                  p++;
                              } while(p<=(-1*l+u)); // end of odd do -while statement
                              
                          } // end of do -while if statement for odd numbers
                          System.out.println(); //to add a space
                        l++;  
                      } while(l<u); // end of second do -while
                     u++; 
                  } while(u<=input); // end of first do-while
                  
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            } // end of if statement to make sure value between 1 and 30
            else{ //else
                System.out.println(" You did not enter a number between 1 and 30!");
            }// end of else statement for second if statement
        }// end of  if statement for has next
        else{ // else 
            System.out.println("You did not enter an integer");
        } // end of else statement for first if statement
    
    
}// end of  main method
    
}// end of class