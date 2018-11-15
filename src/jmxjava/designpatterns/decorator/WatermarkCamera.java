package jmxjava.designpatterns.decorator;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class WatermarkCamera implements MyPhoneCamera {
    @Override
    public void takePhoto() {
         System.out.println("拍照");
         System.out.println("加水印");
    }
}
