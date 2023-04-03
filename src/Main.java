import java.time.LocalDate;

import edu.rafael.challenge.domain.Course;
import edu.rafael.challenge.domain.Mentory;

public class Main {
    public static void main(String[] args){
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Java Course Description");
        course1.setTimeDuration(8);

        System.out.println(course1);

        Course course2 = new Course();
        course2.setTitle("JavaScript Course");
        course2.setDescription("JavaScript Course Description");
        course2.setTimeDuration(10);

        System.out.println(course2);

        Mentory mentory = new Mentory();
        mentory.setTitle("Java Mentory");
        mentory.setDescription("Java Mentory Description");
        mentory.setDate(LocalDate.now());

        System.out.println(mentory);
    }
}