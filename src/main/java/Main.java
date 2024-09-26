//Создайте приложение, которое скачивает файлы из интернета в несколько потоков.
//У пользователя должна быть возможность указать, сколько потоков использовать для загрузки.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nВведите ссылку для скачивания (несколько через пробел) или укажмите выход ' ' ");
            String s = iScanner.nextLine();
            String[] sss = s.split(" ");
            for (String e :
                    sss) {
                UrlLink urlLink = new UrlLink(e);
                urlLink.start();
            }
            if (s.equals(" ")) break;
        }

        System.out.print("\nЗавершение работы программы! Поток ");
        System.out.println(Thread.currentThread().getName());
    }
}
