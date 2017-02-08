package cn.goodman.pattern.proxy;

/**
 * Created by Shaun on 2017/2/8.
 */
public class Beauty {
    public static void main(String[] args) {
        /**
         * 我想认识害羞小男孩
         */
        LoveMaster lm = new LoveMaster();
        lm.sendFlower();
        lm.sweetWords();
        lm.marryMe();
    }
}
