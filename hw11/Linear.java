//Brandon Harris
//HW11
//11-9-15

import java.util.Scanner;

public class Linear {
    public static int[] shuffle(int[] a){
           int t=0;
           int u=0;
           int v=0;
           int z=0;
           int y=0;
           int x=0; //this code works by swapping random numbers in the array 42 times. it stores the values in t ,u and v
           for(int l=1;l<=10;l++){
              z=(int)(Math.random()*14); 
              y=(int)(Math.random()*14);   
              x=(int)(Math.random()*14); 
             t=a[0];
             a[0]=a[z];
             a[z]=t;
             u=a[14];
             a[14]=a[y];
             a[y]=u;
             v=a[4];
             a[4]=a[x];
             a[x]=v;
           }
         return a;
       }
     
    public static void main( String[] args ){
         
         
         Scanner input = new Scanner(System.in);
         int[] grades=new int[15];
         System.out.println("Enter 15 grades in ascending order");
         int k=1;
        int x=0;
         for(int i=0;i<15;i++){
             int l=i-1;
             boolean correct=false;
             System.out.println("Enter grade "+k+" "); //checking fto make sure input is correct
              while(!correct){
             if (input.hasNextInt()){
            grades[i]=input.nextInt();
             if(i==0){ 
             correct =true;
                 if((grades[i]<0)||(grades[i]>100)){ //check to see if intput is in bounds
                   correct=false;
                    System.out.println("Error please enter an integer between 0 and 100");
                    System.out.println("Enter grade "+k+" ");
                 }
            }
            
            else if(grades[i]<grades[l]){ //check to see if input is in ascending order 
                System.out.println("Error enter the grades in ascending order");
                System.out.println("Enter grade "+k+" ");
            }
            else{
                if((grades[i]<0)||(grades[i]>100)){//check for input in bounds 
                    System.out.println("ERROR Please enter an integer between 0 and 100");
                    System.out.println("Enter grade "+k+" ");
                }
                else{ //if it made it here input is legitimate 
                   correct=true;
                }
            }
         }
         else{
         System.out.println("ERROR Input is not an int");// error message 
         System.out.println("Enter grade "+k+" ");
         input.next();
             }
         
         }
         k++;
    }
    System.out.println("sorted");
    for(int j=0;j<15;j++){
        System.out.print(grades[j]+ " ");
    }
    System.out.println(" ");
    System.out.println("Enter a number to search for");
    x=input.nextInt();
    int c=0;
    int c1=1;
    int c2=0;
    int c3=1;
    int x1=0;
    boolean found=false; //boolean for infinite loop
    while(!found){ //searching code infinite loop that only ends once the array is fully searched and the number is found
        if(grades[c]==x){//check for scanned grade
            found=true;
            System.out.println(+x+" was found in the list with " +c1+" iterations" );
        }
        else if(c>=14){//check to see if we searched the entire array 
            found=true;
            System.out.println("The number was not found in this array ");
        }
          c++; //increment blocks 
          c1++;
        }
        shuffle(grades); //shuffle method 
    for(int m=0;m<15;m++){ //prints array 
        System.out.print(grades[m]+ " ");
    }
     System.out.println(" ");
    System.out.println("Enter a number to search for");
    x1=input.nextInt();
    boolean found2=false;
    while(!found2){ //searching code infinite loop that only ends once the array is fully searched and the number is found
        if(grades[c2]==x1){
            found2=true;
            System.out.println(+x1+" was found in the list with " +c3+" iterations" );
        }
        else if(c2>=14){
            found=true;
            System.out.println("The number was not found in this array ");
        }
          c2++;
          c3++; //increments counter 
        }
    }
    }
    
    
    

