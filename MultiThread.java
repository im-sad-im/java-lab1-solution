public class MultiThread{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintTask("Thread 1"));
        Thread thread2 = new Thread(new PrintTask("Thread 2"));
        Thread thread3 = new Thread(new PrintTask("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class PrintTask implements Runnable {
    private String threadName;

    public PrintTask(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": Count " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
