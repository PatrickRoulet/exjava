
import java.util.*;

public class ExB3 {

    public static void main(String[] args) {

	int[] integers = new int[] {1,2,3,4,5};

	int total=0;
	for (int integer : integers) {
	   total+=integer;
	}

        System.out.println("Average : "+total/integers.length);

    }

}