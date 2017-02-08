package cn.goodman.pattern.proxy;

/**
 * Created by Shaun on 2017/2/8.
 */
public class LoveMaster implements Man {
    private Man man;

    public LoveMaster(Man man) {
        this.man = man;
    }

    public LoveMaster() {
        this.man = new ShyBoy();
    }

    /**
     * 情圣代替送鲜花
     */
    public void sendFlower() {
        this.man.sendFlower();
    }

    /**
     * 情圣代替说情话
     */
    public void sweetWords() {
        this.man.sweetWords();
    }

    /**
     * 情圣要你嫁给他
     */
    public void marryMe() {
        this.man.marryMe();
    }
}
