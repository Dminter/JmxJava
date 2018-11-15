package jmxjava.base.string;

import java.text.DecimalFormat;

public class FormatNumber {

        public static void main(String[] args) {
             System.out.println(getMoneyFormat(1d));
             System.out.println(getMoneyFormat(1.2888d));
             System.out.println(getMoneyFormat(0d));
            }

    public static String getMoneyFormat(Double money) {
        String formatStr = "";
        try {
            formatStr = String.valueOf(new DecimalFormat("0.00").format(money));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return formatStr;
    }
}
