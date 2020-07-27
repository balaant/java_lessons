package homework.pingpong;

public class PingPongGame {
    PingPongThread player1 = new PingPongThread("Ping");
    PingPongThread player2 = new PingPongThread("Pong");

    Ball ball;

    PingPongGame() {
        ball = Ball.getBall();
    }

    void startGame() {
        player1.start();
        player2.start();
    }
}
