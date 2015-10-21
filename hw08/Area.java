//Brandon Harris
//HW8
//10-20-15
import java.util.Scanner; //allows for user input in the program

public class Area{
    
    public static void circle(double radius){
    double AreaC= Math.PI*Math.pow(radius,2);
    System.out.println("The area of the circle is " +AreaC+ ""); // method that calculates the area of a circle
    }
     public static void rectangle(double height,double width){
    double AreaR= height*width;
    System.out.println("The area of the rectangle is " +AreaR+ ""); // method that calculates the area of a circle
    }
       public static void triangle (double base, double height){
    double AreaT= .5*(height*base);
    System.out.println("The area of the triangle is " +AreaT+ ""); // method that calculates the area of a circle
    }
    
    
    
    
      public static void main(String[] args) {
      
      Scanner input= new Scanner( System.in);// implements the scanner
      Scanner input2= new Scanner( System.in);// implements the scanner
 boolean correct=false; 
 boolean acceptablec=false;
 boolean acceptableh=false;
 boolean c=false; //boolean values for future if statement 
 boolean t=false;
 boolean r=false ;
 System.out.println("Enter an approved shape in all lowercase letters");
 while(!correct){
     if(input.hasNext("circle")){ // looks for approved shape from input
       correct=true; // if it finds it makes correct true as w
       c=true;
    
     }
     else if (input.hasNext("triangle")){
       correct=true;
       t=true;
           
     }
     else if (input.hasNext("rectangle")){
       correct=true;
       r=true;
     }
     else {
        System.out.println("ERROR please enter a valid shape in all lowercase "); // error section comes here when input is invalid
        System.out.print("Input your shape ");
     input.next();
     }
     
         
 }
  if(c==true){
      double radius=0;
        
        System.out.println("Please enter your radius");
        while(!acceptablec){ 
            if (input2.hasNextDouble() ){ //checks for a double
           radius=input2.nextDouble(); //stores value
           acceptablec=true;
           circle( radius);
        }
        else{
            System.out.println("ERROR enter a double"); // you get here if you did not print a double
            System.out.println("Input your radius "); //you stay here if you fail to input a duble because the boolean does not change
            input2.next();
        }
        
    }
  }
  else if (r==true){
      double height=0;
      double width=0;
      System.out.println("Please enter your height");
        while(!acceptablec){ 
            if (input2.hasNextDouble() ){ //checks for a double
           height=input2.nextDouble(); //stores value
           acceptablec=true;
          
        }
        else{
            System.out.println("ERROR enter a double"); // you get here if you did not print a double 
            System.out.println("Input your height "); //you stay here if you fail to input a duble because the boolean does not change
            input2.next();
        }
        }
        System.out.println("Please enter your width");
        while(!acceptableh){ 
            if (input2.hasNextDouble() ){ //checks for a double
           width=input2.nextDouble(); //stores value
           acceptableh=true;
           rectangle(height,width);
          
        }
        else{
            System.out.println("ERROR enter a double");// you get here if you did not print a double 
            System.out.print("Input your width "); //you stay here if you fail to input a duble because the boolean does not change
            input2.next();
        }
        
    }
  
  
}
else { //only need an else here because the only other valid shape is a triangle 
     double height=0;
      double base=0;
      System.out.println("Please enter your height");
        while(!acceptablec){ 
            if (input2.hasNextDouble() ){ //checks for a double
           height=input2.nextDouble(); //stores value
           acceptablec=true;
          
        }
        else{
            System.out.println("ERROR enter a double"); // you get here if you did not print a double 
            System.out.println("Input your height "); //you stay here if you fail to input a duble because the boolean does not change
            input2.next();
        }
        }
        System.out.println("Please enter your base");
        while(!acceptableh){ 
            if (input2.hasNextDouble() ){ //checks for a double
           base=input2.nextDouble(); //stores value
           acceptableh=true;
           triangle(height,base);
          
        }
        else{
            System.out.println("ERROR enter a double");// you get here if you did not print a double 
            System.out.print("Input your base "); //you stay here if you fail to input a duble because the boolean does not change
            input2.next();
        }
        
    }
} 
}





}