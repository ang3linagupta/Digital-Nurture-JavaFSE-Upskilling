package Exercise40;

public class VirtualThreadDemo {

    public static void main(String[] args)
            throws Exception {

        for(int i = 1; i <= 1000; i++) {

            new Thread(() ->
                    System.out.println(
                            Thread.currentThread())).start();
        }

        Thread.sleep(2000);
    }
}