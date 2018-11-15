package jmxjava.base.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jiaomx on 2017/7/18.
 */

/**
 * public interface Queue<E> extends Collection<E> {
 * boolean add(E var1);
 *
 * boolean offer(E var1);
 *
 * E remove();
 *
 * E poll();
 *
 * E element();
 *
 * E peek();
 * }
 * 先进先出
 */
public class QueueDemo {
    public static void main(String[] args) {
        /**
         *初始化
         */
        Queue<String> queue = new LinkedList<>();
        /**
         *添加元素
         */
        for (int i = 0; i < 10; i++) {
            queue.add(i + "");
        }
        System.out.println(queue);
        /**
         *取出元素并删除，第一个
         */
        String poll = queue.poll();
        System.out.println(poll + " " + queue);
        /**
         *删除一个，第一个
         */
        String remove = queue.remove();
        System.out.println(remove + " " + queue);

        /**
         *删除某一个，是否删除
         */
        boolean remove2 = queue.remove("6");
        System.out.println(remove2 + " " + queue);

        /**
         *取出一个，不删除，第一个
         *
         */
        String peek = queue.peek();
        System.out.println(peek + " " + queue);
        /**
         *追加元素，后面添加
         */
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        System.out.println(queue);
        /**
         *[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
         0 [1, 2, 3, 4, 5, 6, 7, 8, 9]
         1 [2, 3, 4, 5, 6, 7, 8, 9]
         true [2, 3, 4, 5, 7, 8, 9]
         2 [2, 3, 4, 5, 7, 8, 9]
         [2, 3, 4, 5, 7, 8, 9, one, two, three, four]
         */
    }
}
