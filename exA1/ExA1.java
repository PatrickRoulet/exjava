public class ExA1 {
    public String title;
    public int numberOfDays;
    public float pricePerDay;
    public boolean priorKnowledgeRequired;

    public static void main(String[] args) {
        ExA1 course = new ExA1();
	course.title = "Course per default";
	course.numberOfDays = 3;
	course.pricePerDay = 400.0f;
	course.priorKnowledgeRequired = false;
        System.out.println("Course per default created");
        System.out.println("Title : "+course.title);
        System.out.println("Number of days : "+ course.numberOfDays);
        System.out.println("Price per day : "+ course.pricePerDay);
        System.out.println("Prior knowledge required : "+ course.priorKnowledgeRequired);

    }

}