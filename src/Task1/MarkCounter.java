package Task1;

import java.util.Scanner;

public class MarkCounter {
    public static void main(String[] args) {
        System.out.println("Введите оценку по Английскому");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите оценку по математике");
        Scanner scanner1 = new Scanner(System.in);
        int number2 = scanner.nextInt();
        int middle = number + number2;
        middle = middle/=2;
        System.out.println("Средняя оценка" + " " + middle);




    }

}
