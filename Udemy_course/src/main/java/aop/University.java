package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Bulova Katya", 4, 7.6);
        Student st2 = new Student("Bulova Kolya", 5, 8.3);
        Student st3 = new Student("Bulova Zhanna", 1, 3.4);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method student: ");
        System.out.println(students);
        return students;
    }

}
