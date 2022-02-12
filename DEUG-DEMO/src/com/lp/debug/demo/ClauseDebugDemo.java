package com.lp.debug.demo;

import com.lp.debug.demo.support.Person;

import java.security.Permission;

/**
 * 断点回退
 * @author lp
 * @since 2022/2/12 21:20
 */

public class ClauseDebugDemo {


    public static void main(String[] args) {
//        clause();
//        watchVar();
        reloadChanges();
//        setValue();
//        back();
    }

    //加载变化   在debug过程中更改代码，run-->reload changed classes
    private static void reloadChanges() {
        Person p = new Person("后悔药", 12);
        System.out.println(p);
    }

    //观察变量的变化 | 执行表达式  Evaluate Expression
    private static void watchVar() {
        Person p = new Person("后悔药", 12);
        System.out.println(p);
    }

    //设置值
    private static void setValue() {
        Person p = new Person("后悔药", 12);
        if (p.getAge() <= 19){
            System.out.println("未成年");
        }else {
            System.out.println("成熟，可以杀了");
        }
    }

    // drop frame
    private static void back() {
        Person p = new Person("后悔药", 12);
        if (p.getAge() <= 19){
            System.out.println("未成年");
        }else {
            System.out.println("成熟，可以杀了");
        }


    }
    //为断点设置条件表达式  condition
    private static void clause() {
        for (int i = 0; i < 100; i++) {
            //真实情况：并没有if else ，日志查询到，异常记录为i=50
            System.out.println("in the loop");
            if (i == 50) {
                System.out.println("shit happens");
            }else {
                System.out.println("all good");
            }
        }
    }
}
