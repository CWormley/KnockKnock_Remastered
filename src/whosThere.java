import java.util.*;

public class whosThere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("knock knock!");
        String whoIsThere = input.nextLine();//input

        // reference to Source class and retrieve response queues
        Source data = new Source();
        Queue<String> response1 = data.getResponse1();
        Queue<String> response2 = data.getResponse2();
        
        int rep =0;
        while(!valid1(filter(whoIsThere),rep)){//check validity
            System.out.println(response1.poll());//output
            rep++;
            if(response1.isEmpty()){System.exit(0);}//limit reached => exit
            whoIsThere = input.nextLine();//new input
        }//continue
        
        System.out.println("Beets");
        String beetsWho;
        beetsWho = input.nextLine();//input
        
        rep =0;
        while(!valid2(filter(beetsWho))){//check validity
            System.out.print(response2.poll());//output 
            rep++;
            if(rep==6){System.out.print("'"+beetsWho+"'??");}//special case
            System.out.println("");
            if(response1.isEmpty()){System.exit(0);}//limit reached => exit
            beetsWho = input.nextLine();//new input
        }//continue
        
        System.out.println("Beets Me!");
        System.out.println("Ha Ha Ha Ha Ha Ha Ha");
        System.out.println("do you get it? It's like beats me!");
    }
    
    
    
    // remove any non-alphabetic symbols for the inputted string.
    //this will make it easier to compare the user input to the required input.
    public static String filter (String input) {
        char [] elements = input.toCharArray();
        char [] test = new char[elements.length];
        int count = 0;
        for(char x : elements){
            if(Character.isLetter(x)){
                test[count] = Character.toLowerCase(x);
                count++;
            }
        }

        return String.copyValueOf(Arrays.copyOfRange(test,0,count));

    }
    
    //checks user's first response against the required input value
    public static Boolean valid1(String test, int rep){
        if(rep>4){//special case
            return (test.equals("whoisthere")||test.equals("whosthere")||test.equals("who"));//acceptable inputs
        }
        return (test.equals("whoisthere")||test.equals("whosthere"));//acceptable inputs
    }
    
    //checks user's second response against the required input value 
    public static Boolean valid2(String input){
        return input.equals("beetswho");//acceptable input
    }
}

