package jmxjava.designpatterns.decorator;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class TuyaWatermarkCamera implements MyPhoneCamera {
    private WatermarkCamera watermarkCamera;

    public TuyaWatermarkCamera(WatermarkCamera watermarkCamera) {
        this.watermarkCamera = watermarkCamera;
    }

    void before(){
         System.out.println("拍照准备");
    }

    void after(){
         System.out.println("照片涂鸦");
    }


    @Override
    public void takePhoto() {
        before();
        watermarkCamera.takePhoto();
        after();
    }
}
