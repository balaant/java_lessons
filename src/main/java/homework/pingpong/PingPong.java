package homework.pingpong;

import java.util.Scanner;

public class PingPong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Хотите начать игру? Да/Нет");

        while (true) {

            String otvet = sc.next();

            if (otvet.equals("Да")) {

                PingPongGame game = new PingPongGame();
                game.startGame();

                System.out.println("Хотите начать заново? Да/Нет");
                game.newGame();

            } else if (otvet.equals("Нет")) {
                System.out.println("Игра окончена");
                break;
            } else {
                System.out.println("Ошибка (Введите: Да или Нет)");
            }
        }
        sc.close();
    }
}
