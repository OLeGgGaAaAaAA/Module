package Task2;
import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i = 0;
        long n = (long) (1 + Math.random() * 20);
        long a = (long) (1 + Math.random() * 20);
        for (int j = 0; j < n; j++) {
            System.out.println("Число от 1 до n: ");
            i = num.nextInt();
            if (i > a) {
                System.out.println("Число меньше загаданного");
            }
            if (i < a) {
                System.out.println("Число больше загаданного");
            }
            if (i == a) {
                System.out.println("Угадал" + " " + a);
                return;
            }

        }
        System.out.println("Не угадал,было"+" "+n+ " "+"попыток" +",ЛООХ");
    }
}



