package jmxjava.base.string;

public class SubStr {

    public static void main(String[] args) {

        String content = "@s11 xxx";
        try {

            String contentxx = content.substring(2, content.indexOf(" "));
             System.out.println("content::"+contentxx);
            Long timeOffset = Long.parseLong(contentxx);

             System.out.println("timeOffset::"+timeOffset);

             String str = content.substring(content.indexOf(" ")+1,content.length());
              System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
