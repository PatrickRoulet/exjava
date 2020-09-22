
import java.util.*;

public class ExB2 {
    public String title;
    public int numberOfDays;
    public double pricePerDay;
    public boolean priorKnowledgeRequired;
    public List<String> listOfInstructors = new ArrayList<String>();
    public static double VAT = 0.21;
    public String label;

    public static void main(String[] args) {
        ExB2 course = new ExB2();
	if (args.length!=0) {
	   course.title = args[0];
	   course.numberOfDays = Integer.parseInt(args[1]);
	   course.pricePerDay = Double.parseDouble(args[2]);
	} else {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the title of the course : ");
           course.title = input.nextLine();
           System.out.print("Enter the number of days : ");
           String nbDays = input.nextLine();
	   course.numberOfDays = Integer.parseInt(nbDays);
           System.out.print("Enter the price per day : ");
           String priceDay = input.nextLine();
	   course.pricePerDay = Double.parseDouble(priceDay);
           System.out.print("Does the course need prior knowledge (Y/N) ? ");
           String priorKnowledge = input.nextLine();
	   if (priorKnowledge.equals("Y")) {
	      course.priorKnowledgeRequired = true;
	   } else {
	      course.priorKnowledgeRequired = false;
	   }
	}
	
        System.out.println("Course per default created");
        System.out.println("Title : "+course.title);
        System.out.println("Number of days : "+ course.numberOfDays);
        System.out.println("Price per day : "+ course.pricePerDay);
        System.out.println("Prior knowledge required : "+ course.priorKnowledgeRequired);
        System.out.println("Number of instructors : "+ course.listOfInstructors.size());
	double totalPrice = course.calculateTotalPrice();
	if (totalPrice < 500.0) {
	   course.label = "CHEAP";
	} else if (totalPrice > 1500.0) {
	   course.label = "EXPENSIVE";
	} else {
	   course.label = "OK";
	}
        System.out.println("Total price : "+ totalPrice + " ("+course.label+")");

    }

    public ExB2() {
	this.title = "Course per default";
	this.numberOfDays = 3;
	this.pricePerDay = 400.0;
	this.priorKnowledgeRequired = false;
	this.listOfInstructors.add("Instructor1");
	this.listOfInstructors.add("Instructor2");
	this.listOfInstructors.add("Instructor3");
	this.label = "CHEAP";
    }

    public double calculateTotalPrice() {
	if (this.numberOfDays > 3 && this.priorKnowledgeRequired) {
	   System.out.println("Number of days > 3 and prior knowledge required => no VAT");
	   return this.numberOfDays * this.pricePerDay;
	} else {
	   System.out.println("Number of days <= 3 or prior knowledge not required => VAT applied");
	   return this.numberOfDays * this.pricePerDay * (1+ExB2.VAT);
	}
    }

}