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

        UG[] ugStudents = new UG[2];
        PG[] pgStudents = new PG[2];

        // Create UG students and PG students
        ugStudents[0] = new UG("John Doe", 101, 20, 2, 4500);
        ugStudents[1] = new UG("Jane Smith", 102, 19, 1, 4000);
        pgStudents[0] = new PG("Alice Johnson", 201, 24, 3, 6000);
        pgStudents[1] = new PG("Bob Brown", 202, 25, 2, 5500);

        int totalUGAdmissions = ugStudents.length;
        int totalPGAdmissions = pgStudents.length;

        System.out.println("UG Admissions:\n");
        for (UG ugStudent : ugStudents) {
            ugStudent.display();
            System.out.println();
        }

        System.out.println("PG Admissions:\n");
        for (PG pgStudent : pgStudents) {
            pgStudent.display();
            System.out.println();
        }

        System.out.println("Total UG Admissions: " + totalUGAdmissions);
        System.out.println("Total PG Admissions: " + totalPGAdmissions);
    }
}
