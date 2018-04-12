package lean.thread.dome0;

/**
 * Title:
 * Description:
 *
 * @author kong
 * @version 1.0
 * @date 2018/4/11 15:41 首次创建
 * @date 2018/4/11 15:41  最后修改
 * @copyright 中科软科技股份有限公司
 */
public class thead03 extends Thread {
    private  int mun =0;

    @Override
    public void run() {
        for (int i=0 ;i<10;i++){
            mun++;
            System.out.println(Thread.currentThread().getName()+"i= "+i+"-mun= "+mun);

        }

    }

    public static void main(String[] args) {

        System.out.println( Thread.currentThread().getName());
        for (int i=0;i<10;i++){
            thead03 t =new thead03();
            System.out.println(t.currentThread().getName()+"start");
            t.start();
        }

    }

}
