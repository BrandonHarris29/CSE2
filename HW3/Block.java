//Brandon Harris
//HW3 part 2
//9-15-15

import java.util.Scanner; //allows for user input in the program

public class Block{
    
      public static void main(String[] args) {
      
          
          
        Scanner myScanner= new Scanner( System.in);// implements the scanner 
System.out.println("Enter the length of the block");//user input  
double length = myScanner.nextDouble(); //accepts user input
System.out.println("Enter the width of the block");//user input  
double width = myScanner.nextDouble(); //accepts user input
System.out.println("Enter the height of the block");//user input  
double height = myScanner.nextDouble(); //accepts user input
double Volume=length*width*height; //finds the volume
double surfacearea=(2*width*length)+(2*width*height)+(2*height*length); //find the surface area 
System.out.println("The volume of the block with dimensions "+length+ " X "+width+" X "+height+ " is "+Volume+" cubic units");//prints out results
System.out.println("The Surface Area of the cube is " +surfacearea+ " square units");//prints out results 


      }
}
