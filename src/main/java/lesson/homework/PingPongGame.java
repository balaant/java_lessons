package lesson.homework;

import java.util.Scanner;

public class PingPongGame {

    public static int GAME_TIME; //Как сделать так, чтобы она обновлялась,т.е. не была статичной и ее было видно в методих других классов?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Хотите начать игру? Да/Нет");

        while (true) {

            String otvet = sc.next();

            if (otvet.equals("Да")) {
                GAME_TIME = (int) (Math.random() * 15);
                PingPong Game = new PingPong();

                PlayerOne playerOne = new PlayerOne(Game);
                PlayerTwo playerTwo = new PlayerTwo(Game);

                System.out.println("Количество ходов " + GAME_TIME*2); //Минус r, которую тоже не видно
                System.out.println("Хотите начать заново? Да/Нет"); // Как выводить после работы потоков, а не в начале?

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
