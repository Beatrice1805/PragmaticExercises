package inputprocessingoutput;

import java.io.InputStream;
import java.util.Scanner;

public class Exercise4 {
    public static <AbstractStringBuilder> void main(String[] args){

        StringBuilder myStory = new StringBuilder();

        String noun, verb, adjective, adverb;

        InputStream input = System.in;
        
        Scanner myScanner = new Scanner(System.in);

        System.out.println(" Enter a noun: ");
        noun = myScanner.nextLine();

        System.out.println("Enter a verb: ");
        verb = myScanner.nextLine();

        System.out.println("Enter an adjective: ");
        adjective = myScanner.nextLine();

        System.out.println(" Enter an adverb: ");
        adverb = myScanner.nextLine();
     
        myStory.append(
                " Do you walk your" + adjective + noun + " quickly?That's hilarious!");
        System.out.println(myStory.toString());


    }
}
