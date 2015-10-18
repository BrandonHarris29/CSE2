//Brandon Harris 
// HW 07
// 10-13-15 

import java.util.Scanner; //allows for user input in the program

public class Twisty{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
     //an integer to store the user input
int Length = 0;
int Width = 0;


//a switch to decide if you want to ask again
boolean acceptable = false;
boolean acceptable2 = false;
//loop until you get acceptable input (i.e. if it's an int)
System.out.print("Enter your desired length ");
while( !acceptable ){
//check if the input is a int.
if (input.hasNextInt() ){
//if so, store it.
Length = input.nextInt();
acceptable = true;
if (Length>80){
    acceptable = false;
  System.out.println(" ERROR: enter a value less than 80");
System.out.print("Input your length: ");  
}
}
else{
//if not, trash it.  This does not assign the output of 
//next() to anything. The output is just discarded.
System.out.println("   ERROR: enter an integer");
System.out.print("Input your length: ");
input.next();
}
} 
System.out.print("Enter your desired width ");
while( !acceptable2 ){
//check if the input is an int.
if (input.hasNextInt() ){
//if so, store it.
Width= input.nextInt();
acceptable2 = true;
if (Width>Length){ //check to see if width is greater than length
    acceptable2 = false;
  System.out.println(" ERROR: enter a width smaller than your length");
System.out.print("Input your width: ");  
}
   
}


else{
//if not, trash it.  This does not assign the output of 
//next() to anything. The output is just discarded.
System.out.println("ERROR: enter an integer");
System.out.print("Input your width ");
input.next();
}
}
for(int i=1; i<=Width;i++){ // for loop for printing out rows 

for(int j=i;j<=Length;j++ ){// for loop for filling out each collum 
    if (j % (Width)==0&& (j/2)%Width==0){ // if statement to figure out when to print # up across the screen 
        System.out.print("#");
    }
     else if (j % (Width)==0&& (j/2)%Width!=0){ // if statement to figure out when to print / across the main screen
      System.out.print("/");
    }
    else if (j==(2*i)-1||j==(2*i)-1+(2*Width)||j==(2*i)-1+(4*Width)||j==(2*i)-1+(8*Width)||j==(2*i)-1+(16*Width)||j==(2*i)-1+(14*Width)||j==(2*i)-1+(18*Width)||j==(2*i)-1+(20*Width)||j==(2*i)+(6*Width)-1||j==(2*i)+(10*Width)-1||j==(2*i)+(12*Width)-1){
        //used to pounds going down across the screen multiple if statements used for projecting the pattern
        System.out.print("#");
        
    }
    else if(j==(2*i)+Width-1||j==(2*i)+(3*Width)-1||j==(2*i)+(3*Width)-1||j==(2*i)+(5*Width)-1||j==(2*i)+(7*Width)-1||j==(2*i)+(9*Width)-1||j==(2*i)+(11*Width)-1||j==(2*i)+(13*Width)-1||j==(2*i)+(15*Width)-1||j==(2*i)+(17*Width)-1||j==(2*i)+(19*Width)-1){
        //used to pounds going down across the screen multiple if statements used for projecting the pattern
    
     System.out.print("\\");
    }
    
    else{   // if it did not fit into either of those catagories print out blank space 
        System.out.print(" ");
    }
}
System.out.println(""); //prints a space at the end of the row
}


}


        }
       
    