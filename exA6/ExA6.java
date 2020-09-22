
import java.util.*;

public class ExA6 {

    public static void main(String[] args) {

	HashMap<String, Integer> months = new HashMap<>();
	months.put("January",31);
	months.put("February",28);
	months.put("March",31);
	months.put("April",30);
	months.put("May",31);
	months.put("June",30);
	months.put("July",31);
	months.put("August",31);
	months.put("September",30);
	months.put("October",31);
	months.put("November",30);
	months.put("December",31);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month (January, February, ...) : ");
        String month = input.nextLine();
        System.out.print("Enter a day : ");
        String dayStr = input.nextLine();
	int daysToGo = months.get(month) - Integer.parseInt(dayStr);
	
        System.out.println("There are still "+daysToGo+ " days to go");

    }

}