
import java.util.*;

public class ExA1 {
    public String title;
    public int numberOfDays;
    public float pricePerDay;
    public boolean priorKnowledgeRequired;
    public List<String> listOfInstructors = new ArrayList<String>();
    public static float VAT = 0.21f;

    public static void main(String[] args) {
        ExA1 course = new ExA1();
	course.title = "Course per default";
	course.numberOfDays = 3;
	course.pricePerDay = 400.0f;
	course.priorKnowledgeRequired = false;
	course.listOfInstructors.add("Instructor1");
	course.listOfInstructors.add("Instructor2");
	course.listOfInstructors.add("Instructor3");
	
        System.out.println("Course per default created");
        System.out.println("Title : "+course.title);
        System.out.println("Number of days : "+ course.numberOfDays);
        System.out.println("Price per day : "+ course.pricePerDay);
        System.out.println("Prior knowledge required : "+ course.priorKnowledgeRequired);
        System.out.println("Number of instructors : "+ course.listOfInstructors.size());
        System.out.println("Total price : "+ course.calculateTotalPrice());

    }

    public float calculateTotalPrice() {
	return this.numberOfDays * this.pricePerDay * (1+ExA1.VAT);
    }

}