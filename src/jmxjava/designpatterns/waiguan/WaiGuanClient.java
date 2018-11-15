package jmxjava.designpatterns.waiguan;

/**
 * Created by jiaomx on 2017/7/18.
 */

/**
 *屏蔽内部处理，外部暴露简单接口操作
 */
public class WaiGuanClient {
        public static void main(String[] args) {

            MobilePhone mobilePhone = new MobilePhone();
            mobilePhone.videoChat();
            mobilePhone.hangup();


            }
}
