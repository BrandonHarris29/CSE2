//Brandon Harris
//HW 2
//9/8/15
public class Arithmetic{
    
     public static void main(String[] args){
           //Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;

double sockcosttotal$=sockCost$*nSocks; //total cost for socks without tax
double glassescosttotal$=nGlasses*glassCost$;//total cost for glasses
double envelopestotal$=nEnvelopes*envelopeCost$;//total cost for envelopes
double totalcost$=sockcosttotal$+glassescosttotal$+envelopestotal$;//total cost before taxes
double salestax$=totalcost$*taxPercent;//calculates the tax amount
double adjsalestax1=salestax$*100;  //multiplies the sales tax by 100 
double y=(int)adjsalestax1;  //converts the sales tax*100 into an integer
double finalsaletax$=(y/100.00); // divides the integer by 100 this entire process was done to reduce the tax to two sig figs
double finalcost$=totalcost$+finalsaletax$; //calculates the final cost with taxes

System.out.println("You bought "+nSocks+ " socks.");
System.out.println("Each sock costs $" +sockCost$+ " ");
System.out.println("The total cost without taxes is $" +sockcosttotal$+" ");
//prints out cost info about socks
System.out.println("You bought "+nGlasses+" glasses."); 
System.out.println("Each glass costs $"+glassCost$ +" ");
System.out.println("The totalcost without taxes is $" +glassescosttotal$ +" ");
//prints out cost info about glasses
System.out.println("You bought "+nEnvelopes+" envelopes");
System.out.println("Each envelope costs $"+envelopeCost$ +" ");
System.out.println("The total cost without taxes is $"+envelopestotal$ +" ");
//prints out cost info about envelopes
System.out.println("The total cost before taxes is $" +totalcost$ + " " );
//prints out the total cost before taxes 
System.out.println("The sales tax is $"+finalsaletax$ +" ");
//prints out the sales tax 
System.out.println("The total costs including sales tax is $"+finalcost$ +" ");
     }
}