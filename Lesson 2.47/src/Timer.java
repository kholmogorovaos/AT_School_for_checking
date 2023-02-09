public class Timer {
    public int seconds;
    public Timer(int seconds) {
        this.seconds = seconds;
    }
    public static void waitSecond()  {
           long startTime = System.currentTimeMillis();
           while (System.currentTimeMillis() < startTime + 1000) {

           }
    }
    public void printTime() {
                long min = this.seconds / 60 % 60,
                sec = seconds / 1 % 60;
                System.out.printf("%02d:%02d", min, sec);
                System.out.println();
        }
    public void start() {
        for (; seconds >= 0; seconds--) {
            printTime();
            waitSecond();
        }
    }
}
