package cn.goodman.pattern.abstractfactory;

/**
 * Created by Shaun on 2017/3/23.
 */
public enum HumanEnum {
    YellowFemaleHuman("cn.goodman.pattern.abstractfactory.YellowFemaleHuman"),
    YellowMaleHuman("cn.goodman.pattern.abstractfactory.YellowMaleHuman"),
    BlackFemaleHuman("cn.goodman.pattern.abstractfactory.BlackFemaleHuman");

    String value = "";
    HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
