package jmxjava.base.string;

public class VideoUrl {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            String no = i + "";
            if (i < 10) {
                no = "0" + i;
            }
            String url = "http://i-1.tongcheng258.com/zhibovideo_1/" + no + ".mp4";
             System.out.println(i+","+url);
        }
    }
}
