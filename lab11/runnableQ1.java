import java.util.*;

class Thread1 implements Runnable {
    public void run() {
        System.out.println("Thread 1 implementing Runnable");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 extending Thread");
    }
}

public class runnableQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("1. Runnable");
            System.out.println("2. Thread");
            System.out.println("3. Exit");
            System.out.println("Enter choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Thread1 t = new Thread1();// object of Runnable
                    Thread t1 = new Thread(t);
                    t1.start();
                    break;

                case 2:
                    Thread2 t2 = new Thread2();
                    t2.start();
                    break;
            }
        }
    }
}
