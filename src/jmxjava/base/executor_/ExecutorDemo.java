package jmxjava.base.executor_;

import jmxjava.base.base.Xutils;

import java.util.concurrent.Executor;

public class ExecutorDemo {
    public static void main(String[] args) {
        MyExecutor myExecutor = new MyExecutor();
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                Xutils.debug("runnable1");
            }
        };  Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Xutils.debug("runnable2");
            }
        };

        myExecutor.execute(runnable1);
        myExecutor.execute(runnable2);
        myExecutor.execute(runnable2);
        myExecutor.execute(runnable1);


        ThreadPerTaskExecutor threadPerTaskExecutor = new ThreadPerTaskExecutor();
        threadPerTaskExecutor.execute(runnable1);
        threadPerTaskExecutor.execute(runnable2);

        }
}
