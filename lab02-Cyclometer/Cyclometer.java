//Brandon Harris
//Lab 02 Cyclometer
// 9-4-15

//Class definition
public class Cyclometer{
    
     public static void main(String[] args){
             int secsTrip1=480;  // time of trip 1
           int secsTrip2=3220;  // time of trip 2
        int countsTrip1=1561;  // number of wheel rotations trip 1
        int countsTrip2=9037; //number of wheel rotations trip 2 
        double wheelDiameter=27.0; // wheel diameter constant 
        double PI=3.14159; // pi constant
        int feetPerMile=5280;  // feet per mile constant 
        int  inchesPerFoot=12;   // inches per fott constant
        int secondsPerMinute=60;  // seconds per minitue constant 
        double distanceTrip1, distanceTrip2,totalDistance;  // Calculates the total distance 
         System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" counts.");
           System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance in miles trip 1 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance in miles  trip 2
        totalDistance= distanceTrip1+distanceTrip2;
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
 
     }
         
         
         
} 