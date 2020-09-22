
public class DoMath {

    public static int calculateAverage(int[] integers) {
	int total=0;
	for (int integer : integers) {
	   total+=integer;
	}
	return total/integers.length;
    }

}