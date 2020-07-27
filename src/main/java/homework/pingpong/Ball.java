package homework.pingpong;

public class Ball {
    private int kicks = 0;
    private int gameTime = (int) (Math.random() * 25);
    private static Ball instance = new Ball();
    private String side = "";

    private Ball() {
    }

    static Ball getBall() {
        return instance;
    }

    synchronized void kick(String playername) {
        kicks++;
        side = playername;
        System.out.println(kicks + " " + side);
    }

    String getSide() {
        return side;
    }

    boolean isInGame() {
        return (kicks < gameTime);
    }

    void newG() {
        kicks = 0;
        gameTime = (int) (Math.random() * 25);
    }
}
