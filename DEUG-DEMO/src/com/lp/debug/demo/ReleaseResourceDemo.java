package com.lp.debug.demo;

/**
 * @author lp
 * @since 2022/2/12 21:45
 */

public class ReleaseResourceDemo {
    //释放资源 | 避免操作资源
    public static void main(String[] args) {
        System.out.println("shit happens");
        System.out.println("find bugs");

        ///当不想走下面的代码时，，在frames对应的地方 右键--> force return
        System.out.println("DB 操作");
        System.out.println("MQ 操作");
        System.out.println("Redis 操作");
    }
}
