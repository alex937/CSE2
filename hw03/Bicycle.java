//Alexander Arteaga
//Hw03 Bicycle
//Bicycle Java Program
//
// (I added two trips because I was unsure if we only need one trip or two trips like the lab)
// The user should input the seconds and front wheel rotation for each trip
// and obtain
//distance of each and the combined distance of bicycle trips as well as average MPH
import java.util.Scanner; // needed to use scanner
public class Bicycle {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	     Scanner myScanner; // calling variable for scanner
   		 myScanner = new Scanner( System.in ); // this allows you to construct the scanner
   		System.out.print("Enter the number of seconds for trip 1(an integer > 0): "); // in order to ask for the variable
   		 int secsTrip1 = myScanner.nextInt(); // this accepts the user input
   		System.out.print("Enter the number of seconds for trip 2(an integer > 0): "); // in order to ask for the variable
   		int secsTrip2 = myScanner.nextInt(); // this accepts the user input
   		System.out.print("Enter the number of counts for trip 1(an integer > 0): "); // in order to ask for the variable
   		int countsTrip1 = myScanner.nextInt(); // this accepts the user input
        System.out.print("Enter the number of counts for trip 2(an integer > 0): "); // in order to ask for the variable
   		int countsTrip2 = myScanner.nextInt(); // this accepts the user input
		
	double wheelDiameter=27.0,  //Diameter of the wheel
  	PI=3.14159, // PI constant
  	feetPerMile=5280,  // feet to mile conversion 5280 feet per mile
  	inchesPerFoot=12,   // inches to foot conversion 12 inches per foot
  	secondsPerMinute=60,  // seconds to minute conversion 60 seconds per minute
  	mintohour=60; // minutes to hour conversion 60 minutes per hour
	double distanceTrip1, distanceTrip2,totalDistance;  
	// Now to print out the numbers
	System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
      // Now we can calculate the distances using the below equations
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	totalDistance=distanceTrip1+distanceTrip2;
	// Finally we can print out the distances as well
	           System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
	// Now we need to get the average miles per hour
	double mph1,mph2,averagemph; 
	mph1=(distanceTrip1/secsTrip1)*secondsPerMinute*mintohour; // calculations for mph for first trip
	mph2=(distanceTrip2/secsTrip2)*(secondsPerMinute)*mintohour; // calculation for mph for second trip
    averagemph=(mph1+mph2)/2; // average mph
       System.out.println("Average Miles per hour was "+averagemph+" mph"); // printing out answer
    



	}  //end of main method   
} //end of class
