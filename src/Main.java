public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread task1 = new MyThread();
        MyThread task2 = new MyThread();
        MyThread task3 = new MyThread();
        MyThread task4 = new MyThread();
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
        task1.interrupt();
        task2.interrupt();
        task3.interrupt();
        task4.interrupt();

    }
}
