package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {
    private static List<ArrayList> mark = new ArrayList<>();
    String English;
    String Geographic;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println(
                    "Что вы хотите сделать?" +
                            "1.Добавить оценку");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Введите оценку по Английскому");
                    scanner.next();
                    System.out.println("Введите оценку по Географии");
                    scanner.next();
                    break;

            }
        }
    }


















