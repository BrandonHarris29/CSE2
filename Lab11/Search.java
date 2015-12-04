//Brandon Harris
//Lab11
//11-6-15

import java.util.Scanner;
import java.util.Arrays;
public class Search{
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array1=new int[5000];
    int[] array2=new int[5000];
    int max=0;
    int min=99999999;
      
    for(int k=0; k<5000; k++){
        array1[k]=(int)(Math.random()*100000);
        array2[k]=(int)(Math.random()*100000);
    //System.out.println(array2[k]+" ");
        //System.out.println(" here");
        
         
    }
     boolean flag = true;   
     int temp;   

     while ( flag ){
            flag= false;    
            for( int j=0;j < array2.length -1;j++ ){
                   if (array2[j] > array2[j+1]){
                           temp = array2[ j ];                
                           array2[ j ] = array2[ j+1 ];
                           array2[ j+1 ] = temp;
                          flag = true; 
                   } 
            } 
      } 

   
    for(int i=0;i<array1.length;i++){
        if(array1[i]>max){
            max=array1[i];
        }
    }
     for(int l=0;l<array1.length;l++){
        if(array1[l]<min){
            min=array1[l];
        }
      
    }
     System.out.println(max+ " is the maximum value of array 1 "); 
    System.out.println(min+ " is the minimum value of array 1 "); 
     System.out.println(array2[4999]+ " is the maximum value of array 2 "); 
    System.out.println(array2[0]+ " is the minimum value of array 2 "); 
     System.out.println("Please enter a number to search for");
     if(input.hasNextInt()){
         int key=input.nextInt();
         boolean found=false;
            int low = 0;
         int high =4999;
         int count=0;
         while(high >= low) {
             int middle = (low + high) / 2;
           if(array2[middle] == key) {
                found=true;
                break;
             }
             if(array2[middle] < key) {
                 low = middle + 1;
             }
             if(array2[middle] > key) {
                 high = middle - 1;
             }
             count=count+1;
}

if(found){
     System.out.println(+key+" has been found in the array with " +count+ " iterations");
}
else{
       System.out.println("Number not found in the array with " +count+ " iterations");
}
     }
     else{
         System.out.println("ERROR incorrect input ending program");
     }
        
    }
}
