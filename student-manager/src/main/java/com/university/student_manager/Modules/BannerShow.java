package com.university.student_manager.Modules;

public class BannerShow {
    public static void showEndpoints() {
        System.out.println("=".repeat(40));
        System.out.println();

        System.out.println("GET    http://localhost:9090/university/students");
        System.out.println();

        System.out.println("GET    http://localhost:9090/university/students/1");
        System.out.println();

        System.out.println("POST   http://localhost:9090/university/students");
        System.out.println();

        System.out.println("PUT    http://localhost:9090/university/students/1");
        System.out.println();

        System.out.println("DELETE http://localhost:9090/university/students/1");
        System.out.println();

        System.out.println("=".repeat(40));
        System.out.println("Server is running on port 9090");
        System.out.println("=".repeat(40));
    }
}