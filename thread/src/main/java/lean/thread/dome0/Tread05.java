package lean.thread.dome0;

/**
 * @author kong
 * @date 2018/4/13.
 */
public class Tread05 {

    public static void main(String a[]) {
        int num = 0;
        TreadTest t = new TreadTest();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);

        thread1.start();
        thread2.start();
        for (int i = 0; i < 100; i++) {
            num++;
            System.out.println(Thread.currentThread().getName() + "--" + num);
        }
    }

}


class TreadTest implements Runnable {

    private int num = 0;


    @Override
    public void run() {

        printfFunction();
    }

    private void printfFunction() {
        for (int i = 0; i < 100; i++) {
            num++;
            System.out.println(Thread.currentThread().getName() + "--" + num);
        }
    }
}