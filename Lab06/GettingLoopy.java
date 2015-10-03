/* Brandon Harris
Lab 06
10-2-15*/

public class GettingLoopy{
    
    public static void main(String[] agrs) {
        int n=0; //declareing varibles 
        int i=0;
        int p=10;
        int d=2;
        int f=0;
        System.out.println("step 1");
        while(n<7){
            n++;  //loop for printing values 1-6
            System.out.print(+n+"");
        }
        while(i<7){
            i++;  //loop for printing 7s 
            System.out.print(+n+"");
        }
         System.out.println("");
        System.out.println("step 2 ");
        System.out.print("while loop ");
        while(p<100){    //gets numbers less than 100 
         p++;    //increments p
         while(d<p){//when d is less than p  it checks if there is a remainder when they are divided 
          if(p%d==0){
           f++;
           //if there is no remainder for all numbers f=0 and the number is prime
          }
          d++;
         }
         if(f==0){  //when f is zero it prints the prime number 
          System.out.print(+p+" ");
         
         }
         f=0;  //resets varibles 
         d=2;
     
        
        }
        f=0;
        d=2;
        p=10; //resets varibles the next sets of code to the same thing just with for loops
       System.out.println("");
       System.out.print("for loop " );
       for(int p1=10;p1<100;p1++){
        for(int d1=2;d1<p1;d1++){
         if (p1%d1==0){
          f++;
         }
        }
        if(f==0){
         System.out.print(+p1+" ");
        }
         f=0;  //resets varibles 
       }
       System.out.println("");
       System.out.print("do while loop " );
       do {
        p++;
        do{
          if(p%d==0){
           f++;
           //if there is no remainder for all numbers f=0 and the number is prime
          }
         d++;
        }while(d<p);
        if(f==0){
        System.out.print(+p+" ");
        }
         f=0;  //resets varibles 
         d=2;
       } while(p<100);
       System.out.println("");
       System.out.println("part 3");
       int j=0;
       int x=(int)(Math.random()*196)+5; //picks a random number between 5 and 200
        while(x>0){ //while this number is greater than zero it prints a symbol 
         System.out.print("c==8 ");  
         x--;
         j++;//decreases x and increses j 
         if(j==20||j==40||j==60||j==80||j==100||j==120||j==140||j==160||j==180||j==200){
          System.out.println("");
         }
        }
        System.out.println("");
       
           
                
            }
           
        }
