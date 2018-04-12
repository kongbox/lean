package lean.thread.dome0;

/**
 * Title:
 * Description:主线程的加载
 */
public class thread04 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread004 t = new Thread004();
            t.start();
        }

        for (int i = 0; i < 10; i++) {
            ThreadA t = new ThreadA();
            Thread tt = new Thread(t);
            tt.start();
        }
    }


}


class Thread004 extends Thread {
    private static int indexNum = 0;

    public Thread004() {
        indexNum++;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--" + indexNum);
    }
}

class ThreadA implements Runnable {

    private static int indexNum = 0;

    public ThreadA() {
        indexNum++;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--" + indexNum);
    }
}
