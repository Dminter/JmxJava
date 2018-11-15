package jmxjava.designpatterns.waiguan;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class PhoneImpl implements Phone {
    @Override
    public void hangup() {
         System.out.println("挂电话");
    }

    @Override
    public void dail() {
 System.out.println("打电话");
    }
}
