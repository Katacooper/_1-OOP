package javaoop.exercises._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise2();
        exercise3();
    }

    /**
     * 1: Create a new Class in this package
     *
     *    Call this class 'Course'
     *
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *
     *    On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called 'Student', add variables
     *    (class variables are called 'fields' or 'attributes')
     *    called 'name' and 'age'
     *
     *    Using the function below set the student name and ages
     *
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        String [] peopleNames = {"Alice", "Aragon", "Alex"};
        Integer [] peopleAges = {23, 31, 38};
        List<String> studentNames = new ArrayList<>(Arrays.asList(peopleNames));
        List<Integer> studentAges = new ArrayList<>(Arrays.asList(peopleAges));
        Student student = new Student();
        createNewStudent("Paolo", 20);
        studentNames.add(student.name);
        studentAges.add(student.age);
        // Use a for i loop
        for(int i = 0; i < studentNames.size(); i++)
        {
            System.out.print("Student name: " + studentNames.get(i));
            System.out.println(" || Age : " + studentAges.get(i));
        }
    }

    private static Student createNewStudent(String name, Integer age)
    {
        Student student = new Student();
        // Write your code here
        student.setName(name);
        student.setAge(age);
        return student;
    }

    /*
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double average = 0;
        int sum = 0;
        // Write your code here
        Course student = new Course();
        for(int i = 0; i < student.studentAges.size(); i++)
        {
            sum += student.studentAges.get(i);
        }
        average = sum / student.studentAges.size();
        System.out.println("The average age of the student is : " + average);
    }
}