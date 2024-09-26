import java.util.Random;

public class UrlLink extends Thread{
    private String name;

    public UrlLink(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("\n" + Thread.currentThread().getName());
            DownloadFile.loader(name);
            Thread.sleep(new Random().nextInt(999));
            System.out.println("Загрузка файла: " + name + " завершена!");
            Thread.interrupted();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
