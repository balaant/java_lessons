package lesson.homework;

public class PingPong {
    public boolean isActive = false;

    public synchronized void playerOne(String playerOne) {
        if (isActive) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("PlayerOne: ");
        System.out.println(playerOne);
        isActive = true;
        notify();
    }

    public synchronized void playerTwo(String playerTwo) {
        if (!isActive) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print("PlayerTwo: ");
        System.out.println(playerTwo);
        isActive = false;
        notify();
    }
}
