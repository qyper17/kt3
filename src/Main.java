import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command;

        do {

            System.out.println("Добро пожаловать в игру <<0 to 100>>");
            System.out.println("Сделайте свой выбор");
            System.out.println("1 - Начать игру");
            System.out.println("2 - Настройки");
            System.out.println("3 - Титры");
            System.out.println("4 - Выход");


            command = scanner.nextLine();
            switch (command){

                case "1":
                    startNewGame();
                    break;

                case "2":
                    openOptions();
                    break;

                case "3":
                    showAuthors();
                    break;

                case "4":
                    break;

                default:
                    System.out.println("Не понял, что вы нажали! Попробуйте еще :)");
            }
        }
        while (!command.equals("4"));
    }

    private static void startNewGame() {
    }

    private static void openOptions() {
    }

    private static void showAuthors() {
        System.out.println(" Сие произведение искусства было создано руками великолепного\n Дмитрия свет Степановича Стерхова \n Версия игры 0.0.12 [alpha] \n Последнее обновление 08.11.2022 \n \n \n");
    }
}
