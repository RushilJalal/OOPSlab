class Student {
    int regNo;
    String name;
    int age;
    String type;
    int fees;

    Student(String name, int regNo, int age, String type) {
        this.name = name;
        this.regNo = regNo;
        this.age = age;
        this.type = type;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regNo);
        System.out.println("Age: " + age);
    }

}

class UG extends Student {
    int sem;
    double fees;

    UG(String name, int regNo, int age, int semester, double fees) {
        super(name, regNo, age, "UG");
        sem = semester;
        this.fees = fees;
    }

    void display() {
        super.display();
        System.out.println("Semester: " + sem);
        System.out.println("Fees: " + fees);
    }

}

class PG extends Student {
    int sem;
    double fees;

    PG(String name, int regNo, int age, int semester, double fees) {
        super(name, regNo, age, "PG");
        sem = semester;
        this.fees = fees;
    }

    void display() {
        super.display();
        System.out.println("Semester: " + sem);
        System.out.println("Fees: " + fees);
    }
}

class Q2 {
    public static void main(String[] args) {

        UG[] ugStudents = new UG[100];
        PG[] pgStudents = new PG[100];
        int ugCount = 0;
        int pgCount = 0;
        // Create UG students and PG students
        ugStudents[ugCount++] = new UG("John Doe", 101, 20, 2, 4500);
        ugStudents[ugCount++] = new UG("Jane Smith", 102, 19, 1, 4000);
        pgStudents[pgCount++] = new PG("Alice Johnson", 201, 24, 3, 6000);
        pgStudents[pgCount++] = new PG("Bob Brown", 202, 25, 2, 5500);

        System.out.println("UG Admissions:\n");
        for (int i = 0; i < ugCount; i++) {
            ugStudents[i].display();
            System.out.println();
        }

        System.out.println("PG Admissions:\n");
        for (int i = 0; i < pgCount; i++) {
            pgStudents[i].display();
            System.out.println();
        }

        System.out.println("Total UG Admissions: " + ugCount);
        System.out.println("Total PG Admissions: " + pgCount);
    }
}
