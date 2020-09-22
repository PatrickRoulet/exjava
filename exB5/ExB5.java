
import java.util.*;

public class ExB5 {

    public static void main(String[] args) {

        String answer = "Y";

	while (answer.equals("Y")) {
	   System.out.println("Welcome!");
           Scanner input = new Scanner(System.in);
           System.out.print("Would you like to be greeted again? (Y/N) ? ");
	   answer = input.nextLine();
	}

    }

}