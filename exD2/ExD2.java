
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExD2 {
    public String title;
    public int numberOfDays;
    public double pricePerDay;
    public boolean priorKnowledgeRequired;
    public List<String> listOfInstructors = new ArrayList<String>();
    public static double VAT = 0.21;
    public String label;

    public static void main(String[] args) {
        ExD2 course = new ExD2();

	if (args.length!=0) {
	   course.title = args[0];
	   course.numberOfDays = Integer.parseInt(args[1]);
	   course.pricePerDay = Double.parseDouble(args[2]);
	} else {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the title of the course : ");
           course.title = input.nextLine();

	   boolean nbDaysIsInt = false;
	   boolean priceDayIsDouble = false;

	   while (!nbDaysIsInt || !priceDayIsDouble) {
	      try {
		if (!nbDaysIsInt) {
                   System.out.print("Enter the number of days : ");
                   String nbDays = input.nextLine();
	           course.numberOfDays = Integer.parseInt(nbDays);
		   nbDaysIsInt = true;
		}
		if (!priceDayIsDouble) {
                   System.out.print("Enter the price per day : ");
                   String priceDay = input.nextLine();
	           course.pricePerDay = Double.parseDouble(priceDay);
		   priceDayIsDouble = true;
		}
	      } catch (NumberFormatException except) {
	        System.out.println("Wrong type of input, please correct");
	      }
	   }

           System.out.print("Does the course need prior knowledge (Y/N) ? ");
           String priorKnowledge = input.nextLine();
	   if (priorKnowledge.equals("Y")) {
	      course.priorKnowledgeRequired = true;
	   } else {
	      course.priorKnowledgeRequired = false;
	   }
	   input.close();
	}	
	double totalPrice = course.calculateTotalPrice();
	if (totalPrice < 500.0) {
	   course.label = "CHEAP";
	} else if (totalPrice > 1500.0) {
	   course.label = "EXPENSIVE";
	} else {
	   course.label = "OK";
	}

	BufferedReader bufferedReader = null;
	try {
	   String currentLine;
	   bufferedReader = new BufferedReader(new FileReader("instructors.txt"));
	   while ((currentLine = bufferedReader.readLine()) != null) {
	      course.listOfInstructors.add(currentLine);
	   }
	} catch (IOException except) {
 	   except.printStackTrace();
	}
	try {
 	   if (bufferedReader != null) {
	      bufferedReader.close();
	   }
	} catch (IOException except) {
	   except.printStackTrace();
	}

	course.printInfo(course.title, course.numberOfDays, course.pricePerDay, course.priorKnowledgeRequired, course.label, totalPrice);

    }

    public ExD2() {
	this.title = "Course per default";
	this.numberOfDays = 3;
	this.pricePerDay = 400.0;
	this.priorKnowledgeRequired = false;
	this.label = "CHEAP";
    }

    public double calculateTotalPrice() {
	if (this.numberOfDays > 3 && this.priorKnowledgeRequired) {
	   System.out.println("Number of days > 3 and prior knowledge required => no VAT");
	   return this.numberOfDays * this.pricePerDay;
	} else {
	   System.out.println("Number of days <= 3 or prior knowledge not required => VAT applied");
	   return this.numberOfDays * this.pricePerDay * (1+ExD2.VAT);
	}
    }

    public void printInfo(String title, int numberOfDays, double pricePerDay, boolean priorKnowledgeRequired, String label, double totalPrice) {

	BufferedWriter bufferedWriter = null;
	try {
	   String currentLine;
	   bufferedWriter = new BufferedWriter(new FileWriter("courseinfo.txt"));
	   bufferedWriter.write("Title : "+title+"\n");
	   bufferedWriter.write("Number of days : "+ numberOfDays+"\n");
	   bufferedWriter.write("Price per day : "+ pricePerDay+"\n");
	   bufferedWriter.write("Prior knowledge required : "+ priorKnowledgeRequired+"\n");
	   bufferedWriter.write("Number of instructors : "+ listOfInstructors.size()+"\n");
	   for (String instructor : listOfInstructors) {
	      bufferedWriter.write("Instructor : "+ instructor+"\n");
	   }
	   bufferedWriter.write("Total price : "+ totalPrice + " ("+label+")");
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
/*
        System.out.println("Title : "+title);
        System.out.println("Number of days : "+ numberOfDays);
        System.out.println("Price per day : "+ pricePerDay);
        System.out.println("Prior knowledge required : "+ priorKnowledgeRequired);
        System.out.println("Number of instructors : "+ listOfInstructors.size());
	for (String instructor : listOfInstructors) {
           System.out.println("Instructor : " + instructor);
	}
	System.out.println("Total price : "+ totalPrice + " ("+label+")");
*/
    }

}