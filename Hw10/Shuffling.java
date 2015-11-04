//Brandon Harris
//Hw10
//11-3-15
public class Shuffling{
    
    public static void printArray(String[] x){
        int y=x.length;
        //System.out.println("again ");
        for(int j=0;j<y;j++){
            System.out.print(x[j]+" ");
        }
       System.out.println(" ");
    }
     public static String[] randomizeHand (String[] x){
         String[] output = new String[5];
         boolean check1=false;
         boolean check2=false;
         boolean check3=false;
         boolean check4=false;
         int y1=(int)(Math.random()*52); //picks random cards
         int y2=(int)(Math.random()*52); 
         while(!check1){
         if(y1==y2){
             y2=(int)(Math.random()*52); //check to see if cards picked are the same if they are different it picks new values
         }
         else{
             check1=true;
         }
         }
         int y3=(int)(Math.random()*52);
         while(!check2){
         if(y1==y3||y2==y3){
             y3=(int)(Math.random()*52);
         }
         else{
             check2=true;
         }
         }
         int y4=(int)(Math.random()*52);
         while(!check3){
         if(y1==y4||y2==y4||y3==y4){
             y4=(int)(Math.random()*52);
         }
         else{
             check3=true;
         }
         }
         int y5=(int)(Math.random()*52);
         while(!check4){
         if(y1==y5||y2==y5||y3==y5||y4==y5){
             y5=(int)(Math.random()*52);
         }
         else{
             check4=true;
         }
         }
        output[0]=x[y1];
        output[1]=x[y2];
        output[2]=x[y3];
        output[3]=x[y4];
        output[4]=x[y5];
        return output; 
     }
       public static String[] shuffle(String[] a){
           String t="nothing";
           String u="nothing";
           String v="nothing";
           int z=0;
           int y=0;
           int x=0; //this code works by swapping random numbers in the array 42 times. it stores the values in t ,u and v
           for(int l=1;l<=43;l++){
              z=(int)(Math.random()*52); 
              y=(int)(Math.random()*52);   
              x=(int)(Math.random()*52); 
             t=a[0];
             a[0]=a[z];
             a[z]=t;
             u=a[51];
             a[51]=a[y];
             a[y]=u;
             v=a[35];
             a[35]=a[x];
             a[x]=v;
           }
         return a;
       }
     
     
    
     
  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
String[] cards = new String[52];
String[] hand = new String[5];
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13];
 // System.out.print(cards[i]+" "); 
}
printArray(cards);
shuffle(cards);
System.out.println("Shuffled");
printArray(cards);
hand = randomizeHand(cards);
System.out.println("Random Hand");
printArray(hand);
  }
}
