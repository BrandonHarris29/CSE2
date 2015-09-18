//Brandon Harris
//Lab 03 Check
//9-11-15



import java.util.Scanner;
// Document your program. Place your comments here!
//
//
public class Check{
    // main method required for every Java program
public static void main(String[] args) {
    Scanner myScanner= new Scanner( System.in);// implements the scanner
System.out.print("Enter the original cost of the check in the form xx.xx: ");//user input
double checkCost = myScanner.nextDouble(); //accepts user input
System.out.print("Enter the percent tip as a whole number in the form xx");// Prompts for use input
double tipPercent = myScanner.nextDouble(); //Puts input into scanner
tipPercent/=100; //Converts the tip into a decimal value
System.out.print("Enter the number of people who went out to dinner");//prompts for user input
int numPeople = myScanner.nextInt();//scanner detects input
double totalcost;
double costperperson;
int dollars;//whole dollar ammount of cost
int dimes;//number of dimes owed
int pennies;// number of pennies owed this is done for digits to the right of the decimal point
totalcost=checkCost*(1+tipPercent); //calculates total cost based on inputs
costperperson=totalcost/numPeople;//calculates cost per person
dollars=(int)costperperson; //calculates dollar ammount
dimes=(int)(costperperson*10)%10;//calculates the remainder 
pennies=(int)(costperperson*100)%10;
System.out.println("Each person in the group owes $"+dollars+ '.'+dimes+pennies);//prints out the output

           }  //end of main method   
    } //end of class

