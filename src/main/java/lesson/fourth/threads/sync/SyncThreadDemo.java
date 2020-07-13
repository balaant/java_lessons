package lesson.fourth.threads.sync;

public class SyncThreadDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        SyncThread threadOne = new SyncThread("Synchronized Thread One", counter);
        SyncThread threadTwo = new SyncThread("Synchronized Thread Two", counter);

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();
        }catch (InterruptedException e){
            System.out.println("Threads interrupted.");
            e.printStackTrace();
        }
    }
}