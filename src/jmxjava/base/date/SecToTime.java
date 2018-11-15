package jmxjava.base.date;

import java.util.Random;

public class SecToTime {

    public static void main(String[] args) {
        System.out.println(secToTime(100));
        System.out.println(secToTime(3600));
        for (int i = 0; i <100 ; i++) {
            System.out.println(secToTime(new Random().nextInt(1000000)));
        }



    }

    private static String secToTime(int time) {
        int hour = time / 3600;
        int minute = time / 60 % 60;
        int second = time % 60;

        StringBuffer sbInfo = new StringBuffer();
        if (hour > 0) {
            if (hour<10){
                sbInfo.append("0");
            }
            sbInfo.append(hour).append(":");
        }
        if (minute<10){
            sbInfo.append("0");
        }
        sbInfo.append(minute).append(":");
        if (second<10){
            sbInfo.append("0");
        }
        sbInfo.append(second);
        return sbInfo.toString();
    }
}
