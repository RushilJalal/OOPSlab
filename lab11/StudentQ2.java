
/*
 * student class with display method and constructor
 * Members:
 * student id
 * name
 * marks
 * arraylist of 5 student objects
 * display students who scored more than 80
 */
import java.util.*;

class Student {
    int studid;
    String name;
    int marks;

    Student(int id, String n, int m) {
        studid = id;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Student id: " + studid);
        System.out.println("Marks: " + marks);
        System.out.println("Name: " + name);
    }
}

class StudentQ2 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        Student s1 = new Student(1, "Anil", 30);
        Student s2 = new Student(2, "Sunil", 92);
        Student s3 = new Student(3, "Rohit", 85);
        Student s4 = new Student(4, "Anaadi", 45);
        Student s5 = new Student(5, "Swayam", 67);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);
        for (int i = 0; i < 5; i++) {
            if (arr.get(i).marks > 80)
                arr.get(i).display();
        }
    }
}
