package homework;


public class ExceptionThread extends Thread {
    private int seconds;

    public ExceptionThread(int seconds) {
        this.seconds = seconds;
        start();
    }

    @Override
    public void run() {
        System.out.println("Доступ заблокирован!");
        while (seconds > 0) {
            System.out.println("Ждите " + seconds + " секунд");
            try {
                sleep(1000);
            } catch (InterruptedException e) { //Exception для завершения потока
            }
            seconds--;
        }
    }
}
