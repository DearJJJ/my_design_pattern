package com.myself.multithread;

public class ConcurrentTest {
    private static final long count = 100001;

    public static void main(String[] args) throws Exception {

        System.out.println("这是一段来自19:12秒的提交");

        System.out.println("本地同样的位置进行了编辑");

        //serial();
        //concurrency();
        System.out.println("进行了一个修改");
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
