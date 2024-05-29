package S1_08.N3Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, "Python", 7));
        students.add(new Student("Bob", 22, "Java", 6));
        students.add(new Student("Charlie", 19, "PHP", 4));
        students.add(new Student("David", 21, "Java", 8));
        students.add(new Student("Eve", 20, "Python", 5));
        students.add(new Student("Frank", 18, "Java", 9));
        students.add(new Student("Grace", 19, "PHP", 6));
        students.add(new Student("Hannah", 22, "Java", 7));
        students.add(new Student("Isaac", 20, "Python", 3));
        students.add(new Student("Jack", 21, "Java", 5));

        System.out.println("Name\tAge");
        students.forEach(student -> System.out.println(student.name + "\t" + student.age));

        // Filter students whose name starts with 'A'
        List<Student> filteredAStudents = students.stream()
                .filter(student -> student.name.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("\nStudents whose name starts with 'A':");
        filteredAStudents.forEach(student -> System.out.println(student.name + "\t" + student.age));

        System.out.println("\nStudents with a grade of 5 or above:");
        students.stream()
                .filter(student -> student.grade >= 5)
                .forEach(student -> System.out.println(student.name + "\t" + student.age + "\tGrade: " + student.grade));

        System.out.println("\nStudents with a grade of 5 or above who are not studying PHP:");
        students.stream()
                .filter(student -> student.grade >= 5 && !student.course.equals("PHP"))
                .forEach(student -> System.out.println(student.name + "\t" + student.age + "\tGrade: " + student.grade));

        System.out.println("\nJava students who are older than 18:");
        students.stream()
                .filter(student -> student.course.equals("Java") && student.age > 18)
                .forEach(student -> System.out.println(student.name + "\t" + student.age));
    }
}