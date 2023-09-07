public class ThreadPriority{
    public static void main(String[] args) {
        Thread threadW = new Thread(new MyRunnable(), "threadW");
        Thread threadX = new Thread(new MyRunnable(), "threadX");
        Thread threadY = new Thread(new MyRunnable(), "threadY");
        Thread threadZ = new Thread(new MyRunnable(), "threadZ");

        threadW.setPriority(Thread.MIN_PRIORITY);
        threadX.setPriority(threadW.getPriority() * 3);
        threadY.setPriority(Thread.MAX_PRIORITY);
        threadZ.setPriority(8);

        System.out.println("Thread " + threadW.getName() + ", Priority: " + threadW.getPriority());
        System.out.println("Thread " + threadX.getName() + ", Priority: " + threadX.getPriority());
        System.out.println("Thread " + threadY.getName() + ", Priority: " + threadY.getPriority());
        System.out.println("Thread " + threadZ.getName() + ", Priority: " + threadZ.getPriority());

        threadW.start();
        threadX.start();
        threadY.start();
        threadZ.start();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": Count " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
