import java.util.*;

class Q2_3 {
    private int m[][];
    private int row, col;

    public Q2_3(int r, int c) {
        Scanner sc = new Scanner(System.in);
        row = r;
        col = c;
        m = new int[r][c];
        System.out.println("Enter elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }
    }

    public void display() {
        System.out.println("Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void transpose() {
        System.out.println("Transpose: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(m[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void maxele() {
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < m[i][j])
                    max = m[i][j];
            }
        }
        System.out.println("Max: " + max);
    }

    public void princ() {
        System.out.println("Principal diagonal: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j)
                    System.out.println(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void nprinc() {
        System.out.println("Non principal diagonal: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i != j && i + j == row - 1)
                    System.out.println(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Q2_3 t = new Q2_3(3, 3);
        Thread t1 = new Thread();
        t.display();
        Thread t2 = new Thread();
        t.transpose();
        Thread t3 = new Thread();
        t.maxele();
        Thread t4 = new Thread();
        t.princ();
        Thread t5 = new Thread();
        t.nprinc();
        if (t1.isAlive())
            System.out.println("T1 is running");
        else
            System.out.println("T1 isn't running");

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join();
            t5.start();
        } catch (InterruptedException e) {
        }
    }
}