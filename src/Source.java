import java.util.LinkedList;
import java.util.Queue;

public class Source {
    public Queue<String> response1;
    public Queue<String> response2;


    public Source() {
        this.response1= new LinkedList<>();
        this.response2 = new LinkedList<>();
    }

    // declare and add responses for response 1 queue
    // one of these will be printed everytime the first needed input is incorrect
    public Queue<String> getResponse1() {
        response1.add("You have to say 'who's there', silly!");
        response1.add("It's okay... Try again!");
        response1.add("You got this, third times the charm!");
        response1.add("Listen it's pretty simple, I say knock knock... YOU say WHO'S THERE");
        response1.add("O K A Y! You can type any variation of 'who's there'. I know cause I wrote the code\nyou know what i'll even let you just put 'who' if two words is to much for you to comprehend");
        response1.add("I'm trying to make this work for us.\nwhat's it going to take?");
        response1.add("Fine. Fine. Enter anything you want! I don't care any more");
        response1.add("I'm sorry, I lied. But how hard is it to type 9 simple letters!");
        response1.add("IM DONE IM DONE WITH THIS\nBeets me! that was the punch line\nthat's it we're done!\nGoodbye :)");
        return response1;
    }


    // declare and add responses for response 2 queue
    // one of these will be printed everytime the second needed input is incorrect
    public Queue<String> getResponse2(){
        response2.add("come on, you got this, say the next line...");
        response2.add("I said my line, now you say yours!");
        response2.add("You got this, third times the charm!");
        response2.add("Listen we are half way through the joke, just say the next line!");
        response2.add("okay. okay. Maybe I need to explain\nI said 'knock knock'\nthen you said 'who's there?'\nI responded 'beets'\nnow you say...");
        response2.add("DUDE! why would you enter ");
        response2.add("WHAT ARE YOU DOING! Is this making you happy? Tormenting me like this");
        response2.add("I don't got all day here!");
        response2.add("NO I'm done, you don't want to say your line! I'm not gonna say mine\nThis is it were done!\nnow you will never get to know the end of the joke and it will torment you forever!\nGoodbye :)");
        return response2;
    }
}

