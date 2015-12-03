//Brandon Harris 
// Lab 07
// 10-9-15 

import java.util.Scanner; //allows for user input in the program

public class encrypted{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
     //an integer to store the user input
int myDouble = 0;

//a switch to decide if you want to ask again
boolean acceptable = false;

//loop until you get acceptable input (i.e. if it's a double)
System.out.print("Enter a number between 0 and 100 ");
while( !acceptable ){
//check if the input is a double.
if (input.hasNextInt() ){
//if so, store it.
myDouble = input.nextInt();
if(myDouble>=100||myDouble<=0){
    acceptable=false;
    System.out.println("ERROR enter a number between 0 and 100");
    System.out.print("Enter a number ");
}
else{
    acceptable=true;
}
}
else{
//if not, trash it.  This does not assign the output of 
//next() to anything. The output is just discarded.
System.out.println("   ERROR: need an integer");
System.out.print("Input your integer: ");
input.next();
}

}
System.out.println(+myDouble+ "");
for(int i=0;i<myDouble;i++){
    for(int j=0;j<myDouble;j++){
        if(j==i||j==(myDouble-i-1)){
            System.out.print(" ");
        }
        else{
        System.out.print("*");
        }
    }
    System.out.println(" ");
}



        }
       
    }
