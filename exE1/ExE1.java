
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class ExE1 {

    public String firstName;
    public String lastName;
    public int currentAge=0;

    public static void main(String[] args) {

	ExE1 instructor = new ExE1();
	int startingAge=0;
	double startingSalary=0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name of the instructor : ");
        instructor.firstName = input.nextLine();
        System.out.print("Enter the last name of the instructor : ");
        instructor.lastName = input.nextLine();
	try {
          System.out.print("Enter the current age of the instructor : ");
          String ageStr = input.nextLine();
	  instructor.currentAge = Integer.parseInt(ageStr);
          System.out.print("Enter the starting age of the instructor : ");
          ageStr = input.nextLine();
	  startingAge = Integer.parseInt(ageStr);
          System.out.print("Enter the starting salary of the instructor : ");
          String salaryStr = input.nextLine();
	  startingSalary = Double.parseDouble(salaryStr);
	} catch (NumberFormatException e) {
	  System.out.println("Wrong type of input");
	}
	input.close();

	instructor.printSalaryHistory(instructor.currentAge, startingAge, startingSalary);
	
    }

    public void printSalaryHistory(int currentAge, int startingAge, double startingSalary) {
	int workingAge = startingAge;
	double workingSalary = startingSalary;
	BufferedWriter bufferedWriter = null;
	try {
	   String currentLine;
	   Path pathToFile= Paths.get("salaryhistory.txt");
	   bufferedWriter = Files.newBufferedWriter(pathToFile);
	   while (workingAge < (startingAge+36) && workingAge < (currentAge+1)) {
	      bufferedWriter.write("Salary of "+this.firstName+" at "+workingAge+" is "+workingSalary+"\n");
	      workingSalary+=workingSalary*0.03;
	      workingAge+=5;
	   }
	   if (workingAge > startingAge+35) {
	      bufferedWriter.write("Maximum salary reached");
	   }
	} catch (IOException except) {
 	   except.printStackTrace();
	}
	try {
 	   if (bufferedWriter != null) {
	      bufferedWriter.close();
	   }
	} catch (IOException except) {
	   except.printStackTrace();
	}
    }

}