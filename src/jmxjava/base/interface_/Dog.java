package jmxjava.base.interface_;
import jmxjava.base.base.Xutils;

/**
 * Created by jiaomx on 2017/7/19.
 */

public class Dog implements Animal {
    @Override
    public void eat() {
        Xutils.debug("狗啃骨头");
    }

    @Override
    public void walk() {

        Xutils.debug("狗在陆地上行走");
    }

    @Override
    public void sleep() {

        Xutils.debug("狗窝里睡觉");
    }
}
