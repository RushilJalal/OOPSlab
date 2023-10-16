class Student_Detail {
    String name;
    int id;
    String college_name = "MIT";

    Student_Detail(String n, int id) {
        name = n;
        this.id = id;
    }

    void display_details() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("College name: " + college_name);
    }
}

class Q1 {
    public static void main(String[] args) {
        // convert to array of objects and use scanner if time
        Student_Detail stu1 = new Student_Detail("Rushil", 1234);
        stu1.display_details();
    }
}