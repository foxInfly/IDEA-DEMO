package com.lp.debug.demo;

import com.lp.debug.demo.support.MyRunnable;

/**
 * @author lp
 * @since 2022/2/12 21:08
 */

public class ThreadDebugDemo {
    //调试多线程
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable, "线程1");
        Thread thread2 = new Thread(myRunnable, "线程2");
        Thread thread3 = new Thread(myRunnable, "线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
