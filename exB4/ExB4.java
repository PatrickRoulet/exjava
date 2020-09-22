
import java.util.*;

public class ExB4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a language code : ");
        String language = input.nextLine();
	
	if (language.equals("NL")) {
	   System.out.println("Goeiedag!");
	} else if (language.equals("FR")) {
	   System.out.println("Bonjour!");
	} else if (language.equals("EN")) {
	   System.out.println("Good day!");
	} else {
	   System.out.println("Goeiedag, bonjour and good day!");
	}

    }

}