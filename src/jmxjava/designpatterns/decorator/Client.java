package jmxjava.designpatterns.decorator;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class Client {

    public static void main(String[] args) {
        WatermarkCamera watermarkCamera = new WatermarkCamera();
        MyPhoneCamera myPhoneCamera = new TuyaWatermarkCamera(watermarkCamera);
        myPhoneCamera.takePhoto();
    }
}
