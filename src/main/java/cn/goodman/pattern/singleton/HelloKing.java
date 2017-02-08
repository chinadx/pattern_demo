package cn.goodman.pattern.singleton;

/**
 * Created by Shaun on 2017/2/8.
 */
public class HelloKing {
    public static void main(String args[]) throws InterruptedException {
        // 第一天见面
        King king1 = King.getInstance();
        king1.show();
        Thread.sleep(1000);

        // 第二天见面
        King king2 = King.getInstance();
        king2.show();
        Thread.sleep(1000);

        // 第三天见面
        King king3 = King.getInstance();
        king3.show();
        Thread.sleep(1000);
    }
}
