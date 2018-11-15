package jmxjava.base.interface_;

import jmxjava.base.base.Xutils;

/**
 * Created by jiaomx on 2017/7/19.
 */

public class Client {

       public static void main(String[] args) {
           Animal fish = new Fish();
           Animal dog = new Dog();
           Xutils.debug(fish.toString());
           }




}
