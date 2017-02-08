package cn.goodman.pattern.proxy;

/**
 * Created by Shaun on 2017/2/8.
 */
public class ShyBoy implements Man {
    public void sendFlower() {
        System.out.println("害羞男孩来送花");
    }

    public void sweetWords() {
        System.out.println("害羞男孩说情话");
    }

    public void marryMe() {
        System.out.println("害羞男孩问你要不要嫁给他");
    }
}
