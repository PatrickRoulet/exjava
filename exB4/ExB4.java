
import java.util.*;

public class ExB4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a language code : ");
        String language = input.nextLine();
	
	switch (language) {
	case "NL":
	   System.out.println("Goeiedag!");
	   break;
	case "FR":
	   System.out.println("Bonjour!");
	   break;
	case "EN":
	   System.out.println("Good day!");
	   break;
	default:
	   System.out.println("Goeiedag, bonjour and good day!");
	}

    }

}