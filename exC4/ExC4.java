
import java.util.*;

public class ExC4 {

    public static void main(String[] args) {

	welcome();

    }

    static void welcome() {
	System.out.println("Welcome!");
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to be greeted again? (Y/N) ? ");
        if (input.nextLine().equals("Y")) {
           welcome(); // recursive call
	}
    }

}