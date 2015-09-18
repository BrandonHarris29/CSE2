//Brandon Harris
//Lab 04
//9-18-15

public class CardGenerator{
    public static void main(String[] args) { //initalization 
        
        int random=(int)(Math.random()*53);// picks a random number between 0 and 52 
        int randomdiamond=random;
        int randomclub=random-13; //adjust card value for clubs 
        int randomheart=random-26; //adjust card value for hearts
        int randomspade=random-39; // adjust card value for spades 
        if (random<=10 &&random>1){// if the number is less than or equal to 13 it will display that you choose a diamonds card 
        System.out.println("You have picked the "+randomdiamond+" of diamonds");}
         if (random>14 && random<=23){// if the number is less than or equal to 26 but greater than 13 it will display that you choose a clubs card 
        System.out.println("You have picked the "+randomclub+" of clubs");}
        if (random>27 && random<=36) {// if the number is less than or equal to 39 but greater than 26 it will display that you choose a hearts card 
        System.out.println("You have picked the "+randomheart+" of hearts");}
         if (random>40 && random<=49){ // if the number is greater than 39 it will display that you choose a spades card 
        System.out.println("You have picked the "+randomspade+" of spades");}
        switch(random){
        case 1: 
        System.out.println("You have picked the ace of diamonds");
        break;
        case 11: 
        System.out.println("You have picked the jack of diamonds");
        break;
        case 12: 
        System.out.println("You have picked the queen of diamonds");
        break;
        case 13: 
        System.out.println("You have picked the king of diamonds");
        break;
        case 14: 
        System.out.println("You have picked the ace of clubs");
        break;
         case 24: 
        System.out.println("You have picked the jack of clubs");
        break;
         case 25: 
        System.out.println("You have picked the queen of clubs");
        break;
        case 26: 
        System.out.println("You have picked the king of clubs");
        break;
        case 27:
        System.out.println("You have picked the ace of hearts");
        break;
        case 37: 
        System.out.println("You have picked the jack of hearts");
        break;
        case 38: 
        System.out.println("You have picked the queen of hearts");
        break;
        case 39: 
        System.out.println("You have picked the king of hearts");
        break;
        case 40: 
        System.out.println("You have picked the ace of spades");
        break;
        case 50: 
        System.out.println("You have picked the jack of spades");
        break;
        case 51: 
        System.out.println("You have picked the queen of spades");
        break;
        case 52: 
        System.out.println("You have picked the king  of spades");
        break;
            //This section is for the special cases when you would pick a face card or an ace using the switch function I defined each card for every special case
        }
        //System.out.println(+random+""); line of code for debugging 
        
        
    }
}