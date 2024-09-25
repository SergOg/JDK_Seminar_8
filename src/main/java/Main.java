//Создайте приложение, которое скачивает файлы из интернета в несколько потоков.
//У пользователя должна быть возможность указать, сколько потоков использовать для загрузки.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("\nВведите число потоков: ");
        int p = iScanner.nextInt();
        System.out.println(p);

    }
}
