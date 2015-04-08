//Alexander Arteaga
//hw10
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  } // end main method
  
  
  
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  } // end list array
  
  
  public static int[] randomInput(){
       
      int array[] = new int[10];
      for(int i=0; i<10; i++ ){
          
          array[i]= (int) (Math.random()*(10));
      }
      return array;
  } // end random input
  
  public static int[] delete(int list[],int pos){
     int hey[] = new int[9];
       
      if (pos >10){
          System.out.println("Deletion not possible");
          System.exit(0);
      }
      else{
          
      for(int a=0; a<(pos-1); a++){
      hey[a] = list[a];
      
      }
      for (int d=8; d>(pos-2);d--){
          int numberz = list[d+1];
          hey[d] = numberz;
      }
      }
      
      return hey;
      
  } // end of delete method
  
  
  
  
  public static int[] remove(int[] list, int target){
      int size=9;
      int hey[]= list;
      for(int b=8; b>=0; b--) {
          int test = list[b]; // I am not sure why but this keeps confusing test with b and not the actual integer stored at b
          if (test==target){
              hey = new int[size];
            for(int a=0; a<(b-1); a++){
      hey[a] = list[a];
      
      }
      for (int d=(size-1); d>(b-2);d--){
          int numberz = list[d];
          hey[d] = numberz;
      }
            
          
         
          size--;
      
         
              
          }
          
          list = hey;
      }
      return hey;
     
  }// end of remove
  
  
  
  
}// end class