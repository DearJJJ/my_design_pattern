package com.myself.multithread;

public class ConcurrentTest {
    private static final long count = 100001;

    public static void main(String[] args) throws Exception {
        System.out.println("第一段内容");

        System.out.println("第二段内容");

    }



    private static void concurrency() throws Exception {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            int a = 0;
            for (long i = 0; i < count; i++) {
                a += 5;
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        thread.join();
        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time + "ms, b=" + b);
    }
}
