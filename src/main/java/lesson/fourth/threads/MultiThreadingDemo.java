package lesson.fourth.threads;

public class MultiThreadingDemo {
    public static void main(String[] args) {
        ThreadByRunnable threadOne = new ThreadByRunnable("ThreadOne");
        ThreadByRunnable threadTwo = new ThreadByRunnable("ThreadTwo");

        threadOne.start();
        threadTwo.start();

//        ThreadByExtending threadOne = new ThreadByExtending("Thread One");
//        ThreadByExtending threadTwo = new ThreadByExtending("Thread Two");
//
//        threadOne.start();
//        threadTwo.start();


    }
}
