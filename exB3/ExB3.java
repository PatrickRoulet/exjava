
import java.util.*;

public class ExB3 {

    public static void main(String[] args) {

	int[] integers = new int[5];
	integers[0] = 1;
	integers[1] = 2;
	integers[2] = 3;
	integers[3] = 4;
	integers[4] = 5;

	int total=0;
	for (int i=0; i<integers.length; i++) {
	   total+=integers[i];
	}

        System.out.println("Average : "+total/integers.length);

    }

}