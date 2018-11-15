package jmxjava.base.interface_;


import jmxjava.base.base.Xutils;

/**
 * Created by jiaomx on 2017/7/19.
 */

public  class Fish implements Animal {

    @Override
    public void eat() {
        Xutils.debug("大鱼吃小鱼");
    }

    @Override
    public void walk() {
        Xutils.debug("水中漫步");
    }

    @Override
    public void sleep() {
        Xutils.debug("睁眼睡觉");
    }
}
