package jmxjava.base.collections.unmodifiableList;

import java.util.ArrayList;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class StudentClient {
        public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<>();
            list.add("语文");
            list.add("数学");
            list.add("英语");
            Student jmx = new Student("jmx",list);

             System.out.println(jmx.getCourses());

            ArrayList<String> list1 = jmx.getCourses();
            list1.add("化学");

            System.out.println(jmx.getCourses());


/**
 *Exception in thread "main" java.lang.ClassCastException: java.util.Collections$UnmodifiableCollection cannot be cast to java.util.ArrayList
 */
            Student1 jmx1 = new Student1("jmx1",list);

            System.out.println(jmx1.getCourses());

            ArrayList<String> list2 = jmx1.getCourses();
            list2.add("化学");

            System.out.println(jmx1.getCourses());

            }
}
