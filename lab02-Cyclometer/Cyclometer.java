//Alexander Arteaga
//Lab 01
//Welcome Class Java Program
//
// run the program java Cyclometer
// This program should print the number of minutes, front wheel rotation,
//distance, and the combined distance of bicycle trips.
public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    int secsTrip1=480;  // Seconds for the first trip
       	int secsTrip2=3220;  // Seconds for the second trip
		int countsTrip1=1561;  // counts for the first trip
		int countsTrip2=9037; // counts for the second trip
	double wheelDiameter=27.0,  //Diameter of the wheel
  	PI=3.14159, // PI constant
  	feetPerMile=5280,  // feet to mile conversion 5280 feet per mile
  	inchesPerFoot=12,   // inches to foot conversion 12 inches per foot
  	secondsPerMinute=60;  // seconds to minute conversion 60 seconds per minute
	double distanceTrip1, distanceTrip2,totalDistance;  //
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




	}  //end of main method   
} //end of class
