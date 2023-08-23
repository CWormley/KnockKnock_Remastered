import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class whosThere {
    public static void main(String[] args) {
        // declare and add responses for condition 1 list
        // one of these will be printed everytime the first needed input is incorrect
        List<String> condition1 = new ArrayList<>();
        condition1.add("You have to say 'who's there', silly!");
        condition1.add("It's okay... Try again!");
        condition1.add("You got this, third times the charm!");
        condition1.add("Listen it's pretty simple, I say knock knock... YOU say WHO'S THERE");
        condition1.add("O K A Y! You can type any variation of 'who's there'. I know cause I wrote the code\nyou know what i'll even let you just put 'who' if two words is to much for you to comprehend");
        condition1.add("I'm ying to make this work for us.\nwhat's it going to take?");
        condition1.add("Fine. Fine. Enter anything you want! I don't care any more");
        condition1.add("I'm sorry, I lied. But how hard is it to type 9 simple letters!");
        condition1.add("IM DONE IM DONE WITH THIS\nBeets me! that was the fucking punch line\nthat's it we're done!");

        // declare and add responses for condition 2
        // one of these will be printed everytime the second needed input is incorrect
        List<String> condition2 = new ArrayList<>();
        condition2.add("come on, you got this, say the next line...");
        condition2.add("I said my line, now you say yours!");
        condition2.add("You got this, third times the charm!");
        condition2.add("Listen we are half way through the joke, just say the next line!");
        condition2.add("okay. okay. Maybe I need to explain\nI said 'knock knock'\nthen you said 'who's there?'\nI responded 'beets'\nnow you say...");
        condition2.add("DUDE! why would you enter ");
        condition2.add("WHAT ARE YOU DOING! Is this making you happy? Tormenting me like this");
        condition2.add("I don't got all day here!");
        condition2.add("NO I'm done, you don't want to say your line! I'm not gonna say mine\nThis is it were done!\nnow you will never get to know the end of the joke and it will torment you forever!\nand don't you dare look up the punchline!");

        //declare scanner for input data collection
        Scanner input = new Scanner(System.in);
        // output text "knock knock"
        System.out.println("knock knock!");
        // store input text
        String whoIsThere = input.nextLine();

        // decide if input is correct, if it is output next line of joke
        // if not send out response and take new input
        for (int i = 0; i < 9; i++) {
            if (i < 5) {
                if (whoIsThere.equals("Who's There?") || whoIsThere.equals("who's there?") || whoIsThere.equals("Who's there?") || whoIsThere.equals("Who's there") || whoIsThere.equals("who's there") || whoIsThere.equals("whos there?") || whoIsThere.equals("whos there") || whoIsThere.equals("Whos there") || whoIsThere.equals("Whos there?") || whoIsThere.equals("WHO'S THERE") || whoIsThere.equals("WHOS THERE") || whoIsThere.equals("WHO'S THERE?") || whoIsThere.equals("WHOS THERE?")) {
                    // if input is correct execute next output of joke and end loop
                    System.out.println("Beets");
                    i = 9;
                } else {
                    // if input is wrong send output response and take new input
                    System.out.println(condition1.get(i));
                    whoIsThere = input.nextLine();
                }
            } else if (i < 8) { // if input is 5 or more conditions for correct expand
                if (whoIsThere.equals("Who's There?") || whoIsThere.equals("who's there?") || whoIsThere.equals("Who's there?") || whoIsThere.equals("Who's there") || whoIsThere.equals("who's there") || whoIsThere.equals("whos there?") || whoIsThere.equals("whos there") || whoIsThere.equals("Whos there") || whoIsThere.equals("Whos there?") || whoIsThere.equals("WHO'S THERE") || whoIsThere.equals("WHOS THERE") || whoIsThere.equals("WHO'S THERE?") || whoIsThere.equals("WHOS THERE?") || whoIsThere.equals("who")) {
                    // if input is correct execute next output of joke and end loop
                    System.out.println("Beets");
                    i = 9;
                } else {
                    // if input is wrong send output response and take new input
                    System.out.println(condition1.get(i));
                    whoIsThere = input.nextLine();
                }
            } else { // last chance for right input or end program
                if (whoIsThere.equals("Who's There?") || whoIsThere.equals("who's there?") || whoIsThere.equals("Who's there?") || whoIsThere.equals("Who's there") || whoIsThere.equals("who's there") || whoIsThere.equals("whos there?") || whoIsThere.equals("whos there") || whoIsThere.equals("Whos there") || whoIsThere.equals("Whos there?") || whoIsThere.equals("WHO'S THERE") || whoIsThere.equals("WHOS THERE") || whoIsThere.equals("WHO'S THERE?") || whoIsThere.equals("WHOS THERE?") || whoIsThere.equals("who")) {
                    // if input is correct execute next output of joke and end loop
                    System.out.println("Beets");
                    i = 9;
                } else {
                    // send response and end program
                    System.out.println(condition1.get(i));
                    System.out.println("Goodbye :)");
                    System.exit(0);
                }
            }
        }
        // declare and initialize variable for second input
        String beetsWho;
        beetsWho = input.nextLine();
        // determine if input is correct, if so, output punchline and end program
        // if incorrect output response and take new input
        for (int n = 0; n < 9; n++) {
            if (n < 5) {
                if (beetsWho.equals("beets who?") || beetsWho.equals("Beets who?") || beetsWho.equals("Beets who") || beetsWho.equals("beets who")) {
                    // if input is correct output punchline and end loop
                    System.out.println("Beets Me!");
                    System.out.println("Ha Ha Ha Ha Ha Ha Ha");
                    System.out.println("do you get it? It's like beats me!");
                    n = 9;
                } else {
                    //if incorrect output response and take new input
                    System.out.println(condition2.get(n));
                    beetsWho = input.nextLine();
                }
            } else if (n == 5) { // format for 5th output response differs.
                if (beetsWho.equals("beets who?") || beetsWho.equals("Beets who?") || beetsWho.equals("Beets who") || beetsWho.equals("beets who")) {
                    // if input is correct output punchline and end loop
                    System.out.println("Beets Me!");
                    System.out.println("Ha Ha Ha Ha Ha Ha Ha");
                    System.out.println("do you get it? It's like beats me!");
                    n = 9;
                } else {
                    //if incorrect output response and take new input
                    System.out.println(condition2.get(n) + beetsWho + " I know you know the line!");
                    beetsWho = input.nextLine();
                }
            } else if (n < 8) { //back to normal response format
                if (beetsWho.equals("beets who?") || beetsWho.equals("Beets who?") || beetsWho.equals("Beets who") || beetsWho.equals("beets who")) {
                    // if input is correct output punchline and end loop
                    System.out.println("Beets Me!");
                    System.out.println("Ha Ha Ha Ha Ha Ha Ha");
                    System.out.println("do you get it? It's like beats me!");
                    n = 9;
                } else {
                    //if incorrect output response and take new input
                    System.out.println(condition2.get(n));
                    beetsWho = input.nextLine();

                }
            } else { //last chance to have correct response
                if (beetsWho.equals("beets who?") || beetsWho.equals("Beets who?") || beetsWho.equals("Beets who") || beetsWho.equals("beets who")) {
                    //if input is correct output punchline and end loop
                    System.out.println("Beets Me!");
                    System.out.println("Ha Ha Ha Ha Ha Ha Ha");
                    System.out.println("do you get it? It's like beats me!");
                    System.out.println("God that took a long time");
                    n = 9;
                } else {
                    //if input is incorrect output response ad end program
                    System.out.println(condition2.get(n));
                    System.out.println("Goodbye :)");
                    System.exit(0);
                }
            }
        }
    }
}



