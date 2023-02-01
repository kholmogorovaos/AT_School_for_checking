public class Timer {
    public int seconds;
    public Timer(int seconds) {
        this.seconds = seconds;
    }
    public static void waitSecond() throws InterruptedException {
           for (int i = 1; i > 0; i--)
        {
           Thread.sleep(1000);
        }
    }
    public String printTime(int seconds) {
        // вывода оставшегося времени в минутах и секундах
               long min = seconds / 60 % 60,
                sec = seconds / 1 % 60;
        return String.format("%02d:%02d", min, sec);
        }
    public void start() {
        for (int i = seconds; i >= 0; i--) {
            System.out.println(printTime(i));
        }
    }
}
