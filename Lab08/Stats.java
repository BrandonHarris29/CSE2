//Brandon Harris
//Lab 08
//10-16-15
import java.util.Scanner;

public class Stats{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean acceptable=false;  
        double p1=0; // declares varibles 
        double p2=0;
        double p3=0;
        double p4=0;
        double p5=0;
        
        while(!acceptable){
        System.out.println("Enter 5 numbers  from smallest number to largest number"); //This loop takes the inputs
        System.out.println("Enter number 1");
        double n1 = input.nextDouble(); //accepts user input
        System.out.println("Enter number 2");
        double n2 = input.nextDouble(); //accepts user input
        if(n1>n2){ //if statement to check if numbers are in ascending order 
            System.out.println("ERROR: Please enter your numbers in ascending order");//If they arent in ascending order it prints an error and resets the loop
        }
        else{
        System.out.println("Enter number 3");
        double n3 = input.nextDouble(); //accepts user input
        if(n2>n3){//If they arent in ascending order it prints an error and resets the loop
            System.out.println("ERROR: Please enter your numbers in ascending order");//If they arent in ascending order it prints an error and resets the loop
        }
        else{
        System.out.println("Enter number 4");
        double n4 = input.nextDouble(); //accepts user input
        if(n3>n4){//If they arent in ascending order it prints an error and resets the loop
         System.out.println("ERROR: Please enter your numbers in ascending order");//If they arent in ascending order it prints an error and resets the loop
        }
        else{
        System.out.println("Enter number 5");
        double n5 = input.nextDouble(); //accepts user input
        if(n4>n5){//If they arent in ascending order it prints an error and resets the loop
          System.out.println("ERROR: Please enter your numbers in ascending order");//If they arent in ascending order it prints an error and resets the loop  
        }
        else{
            acceptable=true; //If it gets here the numbers are in ascending order 
            p1=n1; //varible redfinition 
            p2=n2;
            p3=n3;
            p4=n4;
            p5=n5;
        }
        }
        }
        }
            
             
         
        }
        double mean=((p1+p2+p3+p4+p5)/5); //calculates mean
        double median=p3; //calculates median 
        System.out.println("The Mean Is "+mean+""); //prints mean 
        System.out.println("The Median Is "+median+""); //prints median 
        
        
        
    }
}