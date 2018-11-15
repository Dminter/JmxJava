package jmxjava.designpatterns.waiguan;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class PhoneCameraImpl implements PhoneCamera {
    @Override
    public void open() {
         System.out.println("打开相机");
    }

    @Override
    public void takePhoto() {
        System.out.println("拍摄");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
