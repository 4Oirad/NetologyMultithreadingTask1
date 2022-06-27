public class MyThread extends Thread implements Runnable {

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Всем привет! Я " + Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}