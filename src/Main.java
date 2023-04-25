import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course courseOne = new Course();
        courseOne.setTitle("Java POO Course");
        courseOne.setDescription("This Java course provides an introduction to object-oriented programming " +
                        "concepts, including encapsulation, inheritance, and polymorphism");
        courseOne.setWorkload(10);

        Course courseTwo = new Course();
        courseTwo.setTitle("Docker Fundamentals Course");
        courseTwo.setDescription("The Docker Fundamentals course provides an introduction to containerization " +
                "and teaches the basics of using Docker to build, ship, and run applications in any environment.");
        courseTwo.setWorkload(6);

        Mentoring mentoringOne = new Mentoring();
        mentoringOne.setTitle("Java mentoring");
        mentoringOne.setDescription("Java OOP mentoring involves guiding in developing an understanding of " +
                "object-oriented programming principles and their practical implementation");
        mentoringOne.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitle("Bootcamp Java Developer");
        bootcamp.setDescription("This Java developer bootcamp provides comprehensive training and hands-on " +
                        "experience to equip students with the skills needed to succeed as a Java developer.");
        bootcamp.getBootcampContents().add(courseOne);
        bootcamp.getBootcampContents().add(courseTwo);
        bootcamp.getBootcampContents().add(mentoringOne);

        Developer thiago = new Developer();
        thiago.setName("Thiago Batista");
        thiago.subscribeToBootcamp(bootcamp);
        thiago.progress();
        thiago.progress();

        Developer mario = new Developer();
        mario.setName("Mario Lustosa");
        mario.subscribeToBootcamp(bootcamp);
        mario.progress();

        getDeveloperStatus(thiago);
        getDeveloperStatus(mario);

    }

    static void getDeveloperStatus(Developer developer) {
        System.out.println("Status of " + developer.getName());
        System.out.println("Subscribed on: " + developer.getSubscribedContent());
        System.out.println("Finished content: " + developer.getFinishedContent());
        System.out.println(developer.getName() + " experience point gained: " + developer.calculateTotalExp());
        System.out.println("*************************************************************");
    }
}