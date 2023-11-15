class SharedResource {
    synchronized void display(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    private SharedResource sharedResource;
    private String message;

    MyThread(SharedResource sharedResource, String message) {
        this.sharedResource = sharedResource;
        this.message = message;
    }

    public void run() {
        sharedResource.display(message);
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        MyThread thread1 = new MyThread(sharedResource, "Thread 1");
        MyThread thread2 = new MyThread(sharedResource, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
