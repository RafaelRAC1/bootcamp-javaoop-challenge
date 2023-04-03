import java.time.LocalDate;

import edu.rafael.challenge.domain.Bootcamp;
import edu.rafael.challenge.domain.Course;
import edu.rafael.challenge.domain.Dev;
import edu.rafael.challenge.domain.Mentory;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Java Course Description");
        course1.setTimeDuration(8);

        Course course2 = new Course();
        course2.setTitle("JavaScript Course");
        course2.setDescription("JavaScript Course Description");
        course2.setTimeDuration(10);

        Mentory mentory = new Mentory();
        mentory.setTitle("Java Mentory");
        mentory.setDescription("Java Mentory Description");
        mentory.setDate(LocalDate.now());

        /*
         * System.out.println(course1);
         * System.out.println(course2);
         * System.out.println(mentory);
         */

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setName("Bootcamp Java Developer");
        bootcampJava.setDescription("Java Developer Bootcamp Description");
        bootcampJava.getContents().add(course1);
        bootcampJava.getContents().add(course2);
        bootcampJava.getContents().add(mentory);

        Dev rafaelDev = new Dev();
        rafaelDev.setName("Rafael");
        rafaelDev.registerBootcamp(bootcampJava);
        System.out.println("Registered Contents ("+rafaelDev.getName()+"): "+rafaelDev.getEnrolledContent());
        rafaelDev.progress();
        rafaelDev.progress();
        System.out.println("Registered Contents ("+rafaelDev.getName()+"): "+rafaelDev.getEnrolledContent());
        System.out.println("Completed Contents ("+rafaelDev.getName()+"): "+rafaelDev.getCompletedContents());
        System.out.println("Current XP: "+rafaelDev.calculateTotalXp());

        System.out.println("------------------------------");

        Dev annaDev = new Dev();
        annaDev.setName("Anna");
        annaDev.registerBootcamp(bootcampJava);
        System.out.println("Registered Contents ("+annaDev.getName()+"): "+annaDev.getEnrolledContent());
        annaDev.progress();
        annaDev.progress();
        annaDev.progress();
        System.out.println("Registered Contents ("+annaDev.getName()+"): "+annaDev.getEnrolledContent());
        System.out.println("Completed Contents ("+annaDev.getName()+"): "+annaDev.getCompletedContents());
        System.out.println("Current XP: "+annaDev.calculateTotalXp());

    }
}