//Alexander Arteaga
//Lab 01
//Welcome Class Java Program
//
// run the program java Arithmetic
// This program should print out calculations when buying things from walmart

public class Arithmetic{
    	// main method required for every Java program
   	public static void main(String[] args) {
   	  //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        // tax
        double taxPercent=0.06;
        double totalsockcost$;   //total cost of socks
        double totalglasscost$; // total cost of glasses
        double totalenvelopecost$; // total cost of envelopes
        totalsockcost$=sockCost$*nSocks; // total costs of socks equation
        totalglasscost$=glassCost$*nGlasses;  //total cost of glasses equation
        totalenvelopecost$=envelopeCost$*nEnvelopes; //total cost of envelope equation
        // print to show costs
           System.out.println("Total cost of socks is "+totalsockcost$+" ");
	System.out.println("Total cost of glasses is "+totalglasscost$+" ");
	System.out.println("Total cost of envelopes is "+totalenvelopecost$+" ");
	   double totalamount$; //total amount to pay without tax
	   double totaltax$; // total tax
	   double totalamountwithtax$; //total amount with tax
	   double totaltaxnotrounded$; // total tax not rounded
	   double totaltaxmultiplied$; // totaltax multiplied
	   totalamount$=totalsockcost$+totalglasscost$+totalenvelopecost$; //total amount no tax
	   totaltaxnotrounded$=(taxPercent*(totalsockcost$+totalglasscost$+totalenvelopecost$)); //total tax not rounded
	   totaltaxmultiplied$=totaltaxnotrounded$*100; // multiplied by 100 for converting to integer
	   int totaltaxinteger$=(int) totaltaxmultiplied$; // changing to integer to round
	   double totaltaxdone$=(double)totaltaxinteger$/100; // changing back to double
	   totalamountwithtax$=(totaltaxdone$+totalamount$); // total amount with tax
	  	   System.out.println("Total cost without tax is "+totalamount$+" "); // total cost print without tax
	   System.out.println("Total tax is "+totaltaxdone$+" "); // total tax print
	   System.out.println("Total cost with tax "+totalamountwithtax$+" "); // total amount with tax print
	}  //end of main method   
} //end of class
