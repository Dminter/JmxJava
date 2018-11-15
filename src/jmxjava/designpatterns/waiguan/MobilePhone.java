package jmxjava.designpatterns.waiguan;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class MobilePhone {
    private Phone phone = new PhoneImpl();
    private PhoneCamera camera = new PhoneCameraImpl();

    void videoChat() {
        camera.open();
        phone.dail();
        camera.takePhoto();

    }

    void hangup() {
        camera.close();
        phone.hangup();
    }

}
