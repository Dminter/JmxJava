package jmxjava.base.string;

import java.util.ArrayList;
import java.util.List;

public class StrReadLine {

        public static void main(String[] args) {

            String line = "11\n22\n33";
             System.out.println(line);
            List<String> line2 = new ArrayList<>();

            String xx[] = line.split("\n");
            for (int i = 0; i <xx.length ; i++) {
                System.out.println(xx[i]);
            }




            }
}
