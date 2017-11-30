package Task1;

import java.util.Scanner;

public class Main extends EntryExams {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println(
                    "Что вы планирутете делать?" +
                            "1.Добавить нового пользователя");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("имя");
                    scanner.next();
                    System.out.println("фамилия");
                    scanner.next();
                    break;
            }
        }
    }












