//Brandon Harris
//  HW 3
// 9/15/15


import java.util.Scanner; //allows for user input in the program

public class Timer{
    
    
    public static void main(String[] args) {
        
     Scanner myScanner= new Scanner( System.in);// implements the scanner 
 System.out.println("Enter the current time ");//user input  
double currenttime = myScanner.nextDouble(); //accepts user input
 System.out.println("Enter the time you want to go to dinner");//user input  2
double dinnertime = myScanner.nextDouble(); //accepts user input
double finaltime=dinnertime-currenttime;
int hours;
int miniutes;
hours=(int)finaltime/100;
miniutes=(int)(finaltime)%100;
System.out.println("You have "+hours+" hours and "+miniutes+" miniutes until dinner");
        
    }
}


   
    
    
    
