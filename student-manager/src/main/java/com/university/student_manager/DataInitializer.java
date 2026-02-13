package com.university.student_manager;

import com.university.student_manager.Modules.BannerShow;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final StudentService studentService;

    public DataInitializer(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void run(String... args) {
        // create 3 students
        Student student1 = new Student();
        student1.setFirstname("Іван");
        student1.setLastname("Петренко");
        student1.setEmail("ivan.petrenko@example.com");
        student1.setAge(18);
        studentService.createStudent(student1);

        Student student2 = new Student();
        student2.setFirstname("Марія");
        student2.setLastname("Коваленко");
        student2.setEmail("maria.kovalenko@example.com");
        student2.setAge(22);
        studentService.createStudent(student2);

        Student student3 = new Student();
        student3.setFirstname("Олександр");
        student3.setLastname("Шевченко");
        student3.setEmail("oleksandr.shevchenko@example.com");
        student3.setAge(21);
        studentService.createStudent(student3);

        BannerShow.showEndpoints();
    }
}