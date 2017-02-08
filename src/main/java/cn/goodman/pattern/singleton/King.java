package cn.goodman.pattern.singleton;

import java.util.Date;

/**
 * Created by Shaun on 2017/2/8.
 */
public class King {
    private static King king = null;
    private static Date beginDate = null;
    private King() {
        // 这里用来限制私自实例化
    }
    public static King getInstance() {
        if (king == null) {
            // synchronized关键字用于保证线程安全
            synchronized (King.class) {
                // double check
                if (king == null) {
                    king = new King();
                    beginDate = new Date();
                }
            }
        }
        return king;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void show() {
        System.out.println("朕登基于" + beginDate);
    }

}
