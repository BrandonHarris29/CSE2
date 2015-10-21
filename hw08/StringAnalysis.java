//Brandon Harris
//HW8
//10-20-15

import java.util.Scanner; //allows for user input in the program

public class StringAnalysis{
    
    public static void whole(String x){
           char c='z';
          int j=0; //letter counter
          int k=0; //number counter
        int l=x.length(); // finds the length of the string 
        for(int i=0;i<l;i++){ // for loop used to cycle through all number places 
            c=x.charAt(i); // sets c equal to the character at int i 
            if(c<='z'&& c>='a'){
                j++; // increments letter counter 
            }
            else{
                k++; //increments number counter 
            }
        
        }
        System.out.println( "In the string there are " +j+ " letters and " +k+ " other characters");
    }
     public static void part(String y, int z){
         char c='z';
          int j=0; //letter counter
          int k=0; //number counter
          int l=y.length(); // finds the length of the string 
          if(z>=l){//this loop is made so if the user inputs a z value greater than the length of the string it still gives you an output
            for(int i=0;i<l;i++){ // for loop used to cycle through all number places 
            c=y.charAt(i); // sets c equal to the character at int i 
            if(c<='z'&& c>='a'){
                j++; // increments letter counter 
            }
            else{
                k++; //increments number counter 
            }
        
        }
              
          }
          else{ 
        for(int i=0;i<z;i++){ // for loop used to cycle through all number places 
            c=y.charAt(i); // sets c equal to the character at int i 
            if(c<='z'&& c>='a'){
                j++; // increments letter counter 
            }
            else{
                k++; //increments number counter 
            }
        
        }
          }
        System.out.println( "In the string there are " +j+ " letters and " +k+ " other characters");
    
     }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean acceptable=false;
        boolean acceptable2=false;
        String x="zero";
        String y="zero";
        int z=0;
        int option=0;
        System.out.println( "press 0 if you want to check your entire string for numbers");
        System.out.println(" press 1 if you want to check only part of your string for numbers");
        while(!acceptable){
            if(input.hasNextInt()){
                option=input.nextInt(); //checks if input is n int
                if (option==0){
                    System.out.println("Please enter your string");
                    x=input.next(); //inputs the string
                 
                    acceptable=true; //switches boolean to true 
                    whole(x);// goes to method whole
                }
                else if(option==1){
                   System.out.println("Please enter your string"); 
                   y=input.next(); //inputs the string
                   System.out.println("Please enter the number you want to check up to"); 
                   while(!acceptable2){
                       if(input.hasNextInt()){
                           z=input.nextInt();
                           acceptable2=true;
                       }
                       else{
                          System.out.println("ERROR: Please enter an integer");
                          input.next();
                       }
                   }
                   acceptable2=true; //switches boolean to true 
                   part(y,z);
                   
                }
                else{
                    System.out.println("ERROR: Please enter either 0 or 1");
                  input.next();
                  acceptable=false;
                }
                
            }
            else{
                System.out.println("ERROR: Please enter either 0 or 1");
                  input.next();
            }
        }
    }
    
}