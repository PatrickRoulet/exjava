import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExF1 {

	public static void main(String[] args) {
	
	    BufferedWriter bufferedWriter = null;
	    try {
		Path pathToFile= Paths.get("courseinfo.txt");
		bufferedWriter = Files.newBufferedWriter(pathToFile);
	    } catch (IOException except) {
		except.printStackTrace();
	    }
		
	    Course course1 = new Course("Java",3,200.0,false);		
	    course1.addInstructor("Sandy");
	    course1.addInstructor("Philippe");
	    try {
		course1.printInfo(bufferedWriter);
	    } catch (IOException except) {
		except.printStackTrace();
	    }
            System.out.println("Title : "+course1.getTitle());
            System.out.println("Number of days : "+ course1.getNumberOfDays());
            System.out.println("Price per day : "+ course1.getPricePerDay());
            System.out.println("Prior knowledge required : "+ course1.isPriorKnowledgeRequired());

	    Course course2 = new Course("HTML",5,180.0,true);		
	    course2.addInstructor("Bart");
	    course2.addInstructor("Bruno");
	    try {
		course2.printInfo(bufferedWriter);
	    } catch (IOException except) {
		except.printStackTrace();
	    }
            System.out.println("===============================================================");
            System.out.println("Title : "+course2.getTitle());
            System.out.println("Number of days : "+ course2.getNumberOfDays());
            System.out.println("Price per day : "+ course2.getPricePerDay());
            System.out.println("Prior knowledge required : "+ course2.isPriorKnowledgeRequired());

            try {
		if (bufferedWriter != null) {
		    bufferedWriter.close();
		}
	    } catch (IOException except) {
		except.printStackTrace();
	    }

	}

}