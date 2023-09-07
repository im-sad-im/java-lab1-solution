public class ThreadCreationUsingThreadClass extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread using Thread class: " + i);
        }
    }

    public static void main(String[] args) {
        ThreadCreationUsingThreadClass thread = new ThreadCreationUsingThreadClass();
        thread.start();
    }
}
