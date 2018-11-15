package jmxjava.base.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by jiaomx on 2017/7/18.
 */

/**
 * public interface Deque<E> extends Queue<E> {
 * void addFirst(E var1);
 *
 * void addLast(E var1);
 *
 * boolean offerFirst(E var1);
 *
 * boolean offerLast(E var1);
 *
 * E removeFirst();
 *
 * E removeLast();
 *
 * E pollFirst();
 *
 * E pollLast();
 *
 * E getFirst();
 *
 * E getLast();
 *
 * E peekFirst();
 *
 * E peekLast();
 *
 * boolean removeFirstOccurrence(Object var1);
 *
 * boolean removeLastOccurrence(Object var1);
 *
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
 *
 * void push(E var1);
 *
 * E pop();
 *
 * boolean remove(Object var1);
 *
 * boolean contains(Object var1);
 *
 * int size();
 *
 * Iterator<E> iterator();
 *
 * Iterator<E> descendingIterator();
 * }
 */
/**
 *Deque接口继承了Queue接口,而Queue接口继承了Collection接口,
 LinkedList实现了Deque接口;
 关系很明显了吧
 (顶级接口)Collection-->Queue-->Deque-->LinkedList(实现类)
 */
public class DeQueDemo {
    public static void main(String[] args) {

        Deque<String> queue2 = new LinkedList<>();

        queue2.push("A");
        queue2.push("B");
        queue2.push("C");
        System.out.println(queue2);
        String peek1 = queue2.peek();
        System.out.println(peek1 + " " + queue2);
        while (queue2.size() > 0) {
            System.out.println(queue2.pop());
        }
        System.out.println(queue2);
        /**
         *[C, B, A]
         C [C, B, A]
         C
         B
         A
         []
         */


        /**
         *初始化
         */
        Deque<String> queue = new LinkedList<>();
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

    }
}
