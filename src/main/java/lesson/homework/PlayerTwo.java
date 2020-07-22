package lesson.homework;

import static lesson.homework.PingPongGame.GAME_TIME;

public class PlayerTwo implements Runnable {
    PingPong interaction;
    String playerTwo = "Pong";

    public PlayerTwo(PingPong interaction) {
        this.interaction = interaction;
        new Thread(this, "PlayerTwo").start();
    }

    int r = (int) (Math.random() * 2);

    @Override
    public void run() {
        for (int i = 0; i < GAME_TIME - r; i++) {
            interaction.playerTwo(playerTwo);
        }
    }
}