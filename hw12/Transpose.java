//Brandon Harris
//HW12
//11/17/15
import java.util.Scanner;
public class Transpose{
    
    public static int[][] randomMatrix(int a,int b){
        int[][] random= new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
               random[i][j]=(int)(Math.random()*20)-10;
              
            }
        }
         return random;
    }
    public static void printMatrix(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static int[][] transposeMatrix(int[][] a){
        int[][] transpose= new int[a[0].length][a.length];
        int temp=0;
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
               
                transpose[i][j]=a[j][i];
            }
        }
        return transpose;
    }
      
    
    
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean correct=false;
        boolean correct2=false;
        int height=0;
        int width=0;
        System.out.println("Please enter the size of your matrix");
        System.out.println("Please enter your height");
        while(!correct){
            if(input.hasNextInt()){
              height=input.nextInt();
              if(height<0){
                  System.out.println("ERROR please enter a positive number");
                  System.out.println(" Enter your height");
                  input.next();
              }
              else{
                  correct=true;
              }
              
            }
            else{
                System.out.println("ERROR please enter an integer");
                System.out.println("Enter your height");
                input.next();
            }
        }
        
        System.out.println("Please enter your width");
        while(!correct2){
            if(input.hasNextInt()){
              width=input.nextInt();
              if(width<0){
                  System.out.println("ERROR please enter a positive number");
                  System.out.println(" Enter your width");
                  input.next();
              }
              else{
                  correct2=true;
              }
              
            }
            else{
                System.out.println("ERROR please enter an integer");
                System.out.println("Enter your width");
                input.next();
            }
        }
       int[][]output=new int[height][width];
       int[][] transpose=new int[width][height];
       output=randomMatrix(height,width);
       System.out.println("Original Matrix");
       printMatrix(output);
      transpose=transposeMatrix(output);
      System.out.println("Transposed Matrix");
      printMatrix(transpose);
      
       
       
        
        
    }
}