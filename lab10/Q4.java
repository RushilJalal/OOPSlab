class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class Q4 {
    static void validate(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Invalid age " + age);
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        try {
            validate(20);
        } catch (MyException e) {
            System.out.println("Exception caught...invalid age entered: " + e.getMessage());
        }
    }
}
