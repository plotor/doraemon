package org.zhenchao.dora.callback;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhenchao.wang 2018-06-14 18:20
 * @version 1.0.0
 */
public class AsyncLoopThreadTest {

    static class MyRunnableCallback extends RunnableCallback {

        private static AtomicInteger count = new AtomicInteger();

        @Override
        public void run() {
            System.out.println("[" + count.incrementAndGet() + "] thread-" + Thread.currentThread().getId() + " is running.");
        }

        @Override
        public long sleepMillis() {
            return 1000;
        }
    }

    @Test
    public void loop() throws Exception {
        new AsyncLoopThread(new MyRunnableCallback());
    }

    public static void main(String[] args) {
        new AsyncLoopThread(new MyRunnableCallback());
    }
}