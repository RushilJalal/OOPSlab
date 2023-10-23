class MyException extends Exception {
    MyException(String s) {
        super();
    }
}

public class Q4 {
    static void validate(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Invalid age");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        try {
            validate(19);
        } catch (MyException e) {
            System.out.println("Exception caught...invalid age entered: " + e.getMessage());
        }
    }
}
