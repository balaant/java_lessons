package lesson.homework;

import static lesson.homework.PingPongGame.GAME_TIME;

public class PlayerOne implements Runnable {
    PingPong interaction;
    String playerOne = "Ping";

    public PlayerOne(PingPong interaction) {
        this.interaction = interaction;
        new Thread(this, "PlayerOne").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < GAME_TIME; i++) {
            interaction.playerOne(playerOne);
        }
    }
}
