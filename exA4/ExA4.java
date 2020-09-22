
import java.util.*;

public class ExA4 {
    public String title;
    public int numberOfDays;
    public float pricePerDay;
    public boolean priorKnowledgeRequired;
    public List<String> listOfInstructors = new ArrayList<String>();
    public static float VAT = 0.21f;

    public static void main(String[] args) {
        ExA4 course = new ExA4();
	if (args.length!=0) {
 	   course.title = args[0];
 	   course.numberOfDays = Integer.parseInt(args[1]);
 	   course.pricePerDay = Float.parseFloat(args[2]);
 	}

        System.out.println("Course per default created");
        System.out.println("Title : "+course.title);
        System.out.println("Number of days : "+ course.numberOfDays);
        System.out.println("Price per day : "+ course.pricePerDay);
        System.out.println("Prior knowledge required : "+ course.priorKnowledgeRequired);
        System.out.println("Number of instructors : "+ course.listOfInstructors.size());
        System.out.println("Total price : "+ course.calculateTotalPrice());
    }

    public ExA4() {
 	this.title = "Course per default";
 	this.numberOfDays = 3;
 	this.pricePerDay = 400.0f;
 	this.priorKnowledgeRequired = false;
 	this.listOfInstructors.add("Instructor1");
 	this.listOfInstructors.add("Instructor2");
 	this.listOfInstructors.add("Instructor3");
     }

    public float calculateTotalPrice() {
 	return this.numberOfDays * this.pricePerDay * (1+ExA4.VAT);
     }

}