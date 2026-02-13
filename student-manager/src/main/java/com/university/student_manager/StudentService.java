package com.university.student_manager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();
    private Long nextId = 1L;

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Optional<Student> getStudentById(Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst();
    }

    public Student createStudent(Student student) {
        student.setId(nextId++);
        students.add(student);
        return student;
    }

    public Optional<Student> updateStudent(Long id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                updatedStudent.setId(id);
                students.set(i, updatedStudent);
                return Optional.of(updatedStudent);
            }
        }
        return Optional.empty();
    }

    public boolean deleteStudent(Long id) {
        return students.removeIf(student -> student.getId().equals(id));
    }
}