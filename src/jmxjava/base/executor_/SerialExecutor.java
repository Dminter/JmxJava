package jmxjava.base.executor_;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

public class SerialExecutor implements Executor {
    Queue<Runnable> tasks = new LinkedList<>();
    Executor executor;
    Runnable activite;

    public SerialExecutor(Executor executor) {
        this.executor = executor;
    }

    @Override
    public synchronized void execute(Runnable command) {
        tasks.offer(new Runnable() {
            @Override
            public void run() {
                try {
                    command.run();
                }finally {
                    next();
                }
                if (activite==null){
                    next();
                }
            }
        });
    }

    private synchronized void next() {
        if ((activite=tasks.poll())!=null){
            executor.execute(activite);
        }
    }
}
