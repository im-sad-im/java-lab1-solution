public class ThreadCreationUsingRunnableInterface implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread using Runnable interface: " + i);
        }
    }
    public static void main(String[] args) {
        ThreadCreationUsingRunnableInterface runnableObj = new ThreadCreationUsingRunnableInterface();
        Thread thread = new Thread(runnableObj);
        thread.start();
    }
}
