//Brandon Harris
//HW04
//9-22-15

public class PokerHandCheck{
    public static void main(String[] args) { //initalization 
    
     //part 1 5 card generator 
        int random=(int)(Math.random()*53);// picks a random number between 0 and 52 
        int random2=(int)(Math.random()*53);// picks a random number between 0 and 52 
        int random3=(int)(Math.random()*53);// picks a random number between 0 and 52 
        int random4=(int)(Math.random()*53);// picks a random number between 0 and 52 
        int random5=(int)(Math.random()*53);// picks a random number between 0 and 52
        if(random2==random||random2==random3||random2==random4||random2==random5){
        random2=(int)(Math.random()*53);}// repicks a random number between 0 and 52
        if(random3==random||random3==random2||random3==random4||random3==random5){
        random3=(int)(Math.random()*53);}// repicks a random number between 0 and 52
        if(random4==random||random4==random3||random4==random2||random4==random5){
        random4=(int)(Math.random()*53);}// repicks a random number between 0 and 52
        if(random5==random||random2==random3||random2==random4||random2==random5){
        random5=(int)(Math.random()*53);}// repicks a random number between 0 and 52
        //System.out.println(+random4+""); //line of code for debugging 
        
        
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
        //System.out.println(+random+""); //line of code for debugging 
          int randomdiamond2=random2;
        int randomclub2=random2-13; //adjust card value for clubs 
        int randomheart2=random2-26; //adjust card value for hearts
        int randomspade2=random2-39; // adjust card value for spades 
        if (random2<=10 &&random2>1){// if the number is less than or equal to 13 it will display that you choose a diamonds card 
        System.out.println("You have picked the "+randomdiamond2+" of diamonds");}
         if (random2>14 && random2<=23){// if the number is less than or equal to 26 but greater than 13 it will display that you choose a clubs card 
        System.out.println("You have picked the "+randomclub2+" of clubs");}
        if (random2>27 && random2<=36) {// if the number is less than or equal to 39 but greater than 26 it will display that you choose a hearts card 
        System.out.println("You have picked the "+randomheart2+" of hearts");}
         if (random2>40 && random2<=49){ // if the number is greater than 39 it will display that you choose a spades card 
        System.out.println("You have picked the "+randomspade2+" of spades");}
        switch(random2){
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
        int randomdiamond3=random3;
        int randomclub3=random3-13; //adjust card value for clubs 
        int randomheart3=random3-26; //adjust card value for hearts
        int randomspade3=random3-39; // adjust card value for spades 
        if (random3<=10 &&random3>1){// if the number is less than or equal to 13 it will display that you choose a diamonds card 
        System.out.println("You have picked the "+randomdiamond3+" of diamonds");}
         if (random3>14 && random3<=23){// if the number is less than or equal to 26 but greater than 13 it will display that you choose a clubs card 
        System.out.println("You have picked the "+randomclub3+" of clubs");}
        if (random3>27 && random3<=36) {// if the number is less than or equal to 39 but greater than 26 it will display that you choose a hearts card 
        System.out.println("You have picked the "+randomheart3+" of hearts");}
         if (random3>40 && random3<=49){ // if the number is greater than 39 it will display that you choose a spades card 
        System.out.println("You have picked the "+randomspade3+" of spades");}
        switch(random3){
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
        //System.out.println(+random+""); //line of code for debugging 
        
        int randomdiamond4=random4;
        int randomclub4=random4-13; //adjust card value for clubs 
        int randomheart4=random4-26; //adjust card value for hearts
        int randomspade4=random4-39; // adjust card value for spades 
        if (random4<=10 &&random4>1){// if the number is less than or equal to 13 it will display that you choose a diamonds card 
        System.out.println("You have picked the "+randomdiamond4+" of diamonds");}
         if (random4>14 && random4<=23){// if the number is less than or equal to 26 but greater than 13 it will display that you choose a clubs card 
        System.out.println("You have picked the "+randomclub4+" of clubs");}
        if (random4>27 && random4<=36) {// if the number is less than or equal to 39 but greater than 26 it will display that you choose a hearts card 
        System.out.println("You have picked the "+randomheart4+" of hearts");}
         if (random4>40 && random4<=49){ // if the number is greater than 39 it will display that you choose a spades card 
        System.out.println("You have picked the "+randomspade4+" of spades");}
        switch(random4){
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
        }
         int randomdiamond5=random5;
        int randomclub5=random5-13; //adjust card value for clubs 
        int randomheart5=random5-26; //adjust card value for hearts
        int randomspade5=random5-39; // adjust card value for spades 
        if (random5<=10 &&random5>1){// if the number is less than or equal to 13 it will display that you choose a diamonds card 
        System.out.println("You have picked the "+randomdiamond5+" of diamonds");}
         if (random5>14 && random5<=23){// if the number is less than or equal to 26 but greater than 13 it will display that you choose a clubs card 
        System.out.println("You have picked the "+randomclub5+" of clubs");}
        if (random5>27 && random5<=36) {// if the number is less than or equal to 39 but greater than 26 it will display that you choose a hearts card 
        System.out.println("You have picked the "+randomheart5+" of hearts");}
         if (random5>40 && random5<=49){ // if the number is greater than 39 it will display that you choose a spades card 
        System.out.println("You have picked the "+randomspade5+" of spades");}
        switch(random5){
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
        }
     //part 2 determineing if the cards match
     
        if(random>13&&random<=26){    //done make the random value for each card based on the card value 
        random=randomclub;}
          if(random>26&&random<=39){
        random=randomheart;}
          if(random>39&&random<=52){
        random=randomspade;}
        //System.out.println(+random+""); //line of code for debugging
         if(random2>13&&random2<=26){    //done make the random value for each card based on the card value 
        random2=randomclub2;}
          if(random2>26&&random2<=39){
        random2=randomheart2;}
          if(random2>39&&random2<=52){
        random2=randomspade2;}
         //System.out.println(+random2+""); //line of code for debugging
           if(random3>13&&random3<=26){    //done make the random value for each card based on the card value 
        random3=randomclub3;}
          if(random3>26&&random3<=39){
        random3=randomheart3;}
          if(random3>39&&random3<=52){
        random3=randomspade3;}
         //System.out.println(+random3+""); //line of code for debugging
           if(random4>13&&random4<=26){    //done make the random value for each card based on the card value 
        random4=randomclub4;}
          if(random4>26&&random4<=39){
        random4=randomheart4;}
          if(random4>39&&random4<=52){
        random4=randomspade4;}
         //System.out.println(+random4+""); //line of code for debugging
           if(random5>13&&random5<=26){    //done make the random value for each card based on the card value 
        random5=randomclub5;}
          if(random5>26&&random5<=39){
        random5=randomheart5;}
          if(random5>39&&random5<=52){
        random5=randomspade5;}
         //System.out.println(+random4+""); //line of code for debugging
         if((random==random2&&random==random3)||(random==random2&&random==random4)||(random==random2&&random==random5)){
             System.out.println("You drew a three of a kind "); //three of a kind check 1 
         }
         else if((random2==random3&&random2==random4)||(random2==random3&&random2==random5)){
             System.out.println("You drew a three of a kind "); //three of a kind check 2 
         }
         else if(random3==random4&&random4==random5){
             System.out.println("You drew a three of a kind "); //three of a kind check 3
         }
         else if((random==random3&&random==random4)||(random==random3&&random==random5)){
             System.out.println("You drew a three of a kind "); //three of a kind check 4 
         }
          else if(random==random4&&random==random5){
             System.out.println("You drew a three of a kind "); //three of a kind check 5 
         }
          else if(random2==random4&&random2==random5){
             System.out.println("You drew a three of a kind "); //three of a kind check 6
         }
         else if(random3==random4&&random3==random5){
             System.out.println("You drew a three of a kind "); //three of a kind check 6
         }
        else if ((random==random2&&random3==random4)||(random==random2&&random3==random5)||(random==random2&&random4==random5)){
        System.out.println("You drew two pairs "); //two pair check 1 
    }
      else if ((random==random3&&random2==random4)||(random==random3&&random2==random5)||(random==random3&&random4==random5)){
        System.out.println("You drew two pairs "); //two pair check 2 
    }
     else if ((random==random4&&random2==random3)||(random==random4&&random2==random5)||(random==random4&&random3==random5)){
        System.out.println("You drew two pairs "); //two pair check 3 
    }
    else if ((random==random5&&random2==random3)||(random==random5&&random3==random4)||(random==random5&&random2==random4)){
        System.out.println("You drew two pairs "); //two pair check 4 
    }
    else if (random2==random3&&random4==random5){
        System.out.println("You drew two pairs "); //two pair check 5 
    }
     else if (random==random2||random==random3||random==random4||random==random5){
        System.out.println("You drew a pair "); // pair check 1
    }
     else if (random2==random3||random2==random4||random2==random5){
        System.out.println("You drew a pair "); // pair check 2
    }
     else if (random3==random4||random3==random5){
        System.out.println("You drew a pair "); // pair check 1
    }
     else if (random4==random5){
        System.out.println("You drew a pair "); // pair check 1
    }
    else {
        System.out.println("You have a high card hand ");
    }
    }
   
      
}