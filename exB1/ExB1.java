
import java.util.*;

public class ExB1 {
    public String title;
    public int numberOfDays;
    public float pricePerDay;
    public boolean priorKnowledgeRequired;
    public List<String> listOfInstructors = new ArrayList<String>();
    public static float VAT = 0.21f;

    public static void main(String[] args) {
        ExB1 course = new ExB1();
	if (args.length!=0) {
	   course.title = args[0];
	   course.numberOfDays = Integer.parseInt(args[1]);
	   course.pricePerDay = Float.parseFloat(args[2]);
	} else {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the title of the course : ");
           course.title = input.nextLine();
           System.out.print("Enter the number of days : ");
           String nbDays = input.nextLine();
	   course.numberOfDays = Integer.parseInt(nbDays);
           System.out.print("Enter the price per day : ");
           String priceDay = input.nextLine();
	   course.pricePerDay = Float.parseFloat(priceDay);
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
        System.out.println("Total price : "+ course.calculateTotalPrice());

    }

    public ExB1() {
	this.title = "Course per default";
	this.numberOfDays = 3;
	this.pricePerDay = 400.0f;
	this.priorKnowledgeRequired = false;
	this.listOfInstructors.add("Instructor1");
	this.listOfInstructors.add("Instructor2");
	this.listOfInstructors.add("Instructor3");
    }

    public float calculateTotalPrice() {
	if (this.numberOfDays > 3 && this.priorKnowledgeRequired) {
	   System.out.println("Number of days > 3 and prior knowledge required => no VAT");
	   return this.numberOfDays * this.pricePerDay;
	} else {
	   System.out.println("Number of days <= 3 or prior knowledge not required => VAT applied");
	   return this.numberOfDays * this.pricePerDay * (1+ExB1.VAT);
	}
    }

}