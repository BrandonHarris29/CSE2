//Brandon Harris
// Lab 10
// 10-30-15

import java.util.Scanner;

public class Array {
     public static void main( String[] args ){
         
         
         Scanner input = new Scanner(System.in);
         int number=5;
         String[] students=new String[number];
         int[] midterm= new int[number];
         System.out.println("Enter 5 student names");
         System.out.println("Enter name 1");
         students[0]= input.next();
         System.out.println("Enter name 2");
         students[1]= input.next();
          System.out.println("Enter name 3");
         students[2]= input.next();
          System.out.println("Enter name 4");
         students[3]= input.next();
          System.out.println("Enter name 5");
         students[4]= input.next();
         for(int i=0;i<number;i++){
             midterm[i]=(int)(Math.random()*100);
         }
         for(int j=0;j<number;j++){
             System.out.print(students[j]+ ": ");
             System.out.println(midterm[j]+" ");
         }
         
         
     }
     
}