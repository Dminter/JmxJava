package jmxjava.base.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class ArrayDequeDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Deque<Object> data = new ArrayDeque<Object>();
        // 增加元素
        for (int i = 0; i < 20; i++) {
            data.push(i + " ");
        }
        // 删除第一个
        data.removeFirst();
        // 获取第一个
        System.out.println(data.peekFirst());
        // 增加到最后
        data.addLast("addLast");
        //
        System.out.println(data);

    }
}
