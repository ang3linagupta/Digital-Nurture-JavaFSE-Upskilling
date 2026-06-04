package Exercise26;

class MyThread extends Thread {

    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public void run() {

        for(int i=1;i<=5;i++) {
            System.out.println(message + " " + i);
        }
    }
}

public class ThreadCreationDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        t1.start();
        t2.start();
    }
}