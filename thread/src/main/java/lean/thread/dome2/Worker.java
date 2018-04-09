package lean.thread.dome2;

/**
 * Title:
 * Description:
 *
 * @author kong
 * @version 1.0
 * @date 2018/4/9 17:18 首次创建
 * @date 2018/4/9 17:18  最后修改
 * @copyright 中科软科技股份有限公司
 */
public class Worker extends Thread {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        super.run();
    }
}
