public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        int count = 4;
        for (int i = 0; i < count; i++) {
            new Thread(mainGroup, new MyThread(mainGroup, "Поток " + i)).start();
        }
        Thread.sleep(15000);
        mainGroup.interrupt();
    }
}
