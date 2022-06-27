public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup myGroup = new ThreadGroup("my group");

        MyThread myThread = new MyThread();

        Thread task1 = new Thread(myGroup, myThread);
        Thread task2 = new Thread(myGroup, myThread);
        Thread task3 = new Thread(myGroup, myThread);
        Thread task4 = new Thread(myGroup, myThread);

        task1.setName("Поток 1");
        task2.setName("Поток 2");
        task3.setName("Поток 3");
        task4.setName("Поток 4");

        System.out.println("Создаю потоки...");
        task1.start();
        task2.start();
        task3.start();
        task4.start();

        Thread.sleep(15000);

        System.out.println("Завершаю все потоки...");
        myGroup.interrupt();
    }
}