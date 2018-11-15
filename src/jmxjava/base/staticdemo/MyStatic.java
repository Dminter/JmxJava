package jmxjava.base.staticdemo;

/**
 * Created by jiaomx on 2017/7/18.
 */

/**
 *一旦类MyStatic被装载，static方法就会执行
 */
public class MyStatic {


    static {
        System.out.println("this is static ~");
    }

    public static void main(String[] args) {
        System.out.println("MyStatic");

        /**
         *this is static ~
         MyStatic
         */
    }
}
