package com.lp.debug.demo.support;

import java.util.concurrent.TimeUnit;

/**
 * @author lp
 * @since 2022/2/12 21:10
 */

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()+"--------------进入");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(currentThread.getName()+"--------------离开");
        }
    }
}
