import com.studentapp.model.Person;
import com.studentapp.model.Professor;
import com.studentapp.model.Student;
import com.studentapp.util.AppLogger;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = AppLogger.getInstance();

        // Create Student
        Student student = new Student("Alice", 20, "alice@university.edu", 2, "Computer Science");
        logger.info("Created: " + student);
        logger.info("Letter Grade: " + student.getLetterGrade());
        logger.info("Passing: " + student.isPassing());

        // Create Professor
        Professor prof = new Professor("Dr. Smith", 45, "smith@university.edu", 5, "Mathematics");
        logger.info("Created: " + prof);

        // Polymorphism
        Person person = student;
        logger.info("Role: " + person.getRole());
    }


    }