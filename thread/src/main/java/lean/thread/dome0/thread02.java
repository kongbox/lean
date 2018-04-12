package lean.thread.dome0;

/**
 * Title:
 * Description:
 *
 * @author kong
 * @version 1.0
 * @date 2018/4/11 15:37 首次创建
 * @date 2018/4/11 15:37  最后修改
 * @copyright 中科软科技股份有限公司
 */
public class thread02 implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.printf(Thread.currentThread().getName()+"--"+i);
        }
    }

    public static void main(String[] args) {

        /**
         * 调用线程对象的start()方法来启动该线程。
         * （注意，不是直接调用对象的run()方法，调用对象的run()方法，其实就相当于普通的方法调用，并不会创建线程）
         */
        //主线程
        System.out.println(Thread.currentThread().getName()+"主线程");
        for (int i=0 ;i<10;i++) {
            //子线程
            ThreadDome0 thresd = new ThreadDome0();
//            thresd.setName("myTestThread"+i);
            thresd.start();
        }
    }


}
