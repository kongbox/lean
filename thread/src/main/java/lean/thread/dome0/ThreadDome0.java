package lean.thread.dome0;

/**
 * Title:
 * Description:
 *
 * @author kong
 * @version 1.0
 * @date 2018/4/9 19:08 首次创建
 * @date 2018/4/9 19:08  最后修改
 * @copyright 中科软科技股份有限公司
 */
public class ThreadDome0 extends Thread{

    @Override
    public void run() {
        System.out.println("this thread name is:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDome0 t = new ThreadDome0();
        t.setName("myTestThread");
        t.start();
    }
}
