class Complex {
    int i;
    int r, c;// complex number

    Complex() {

    }

    Complex(int r1, int c1) {
        this.r = r1;
        this.c = c1;
    }

    void add(int i1, Complex c1) {
        int rSum = i1 + c1.r;
        System.out.printf("Result: %d + i%d", rSum, c1.c);
    }

    void add(Complex c1, Complex c2) {
        int rSum = c1.r + c2.r;
        int cSum = c1.c + c2.c;
        System.out.printf("Result: %d + i%d", rSum, cSum);
    }
}

class Q4 {
    public static void main(String[] args) {
        Complex c0 = new Complex();
        Complex c1 = new Complex(5, 7);
        c0.add(2, c1);
    }
}