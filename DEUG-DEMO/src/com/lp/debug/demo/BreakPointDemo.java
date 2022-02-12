package com.lp.debug.demo;

import com.lp.debug.demo.support.Person;

/**
 * @author lp
 * @since 2022/2/12 19:57
 */

public class BreakPointDemo {

    //1.行断点
    public static void line(){
        System.out.println("this is from line.");
    }

    //2.可直接详细设置的断点方式   shift+左键触发
    public static void detailLine(){
        System.out.println("this is from detail line.");
    }

    //3.方法断点 | 接口会直接调转至具体实现类   在方法上触发
    public static void method(){
        System.out.println("this is from detail method.");
    }

    //4.方法详细设置的断点 | 接口会直接调转至具体实现类   shift+在方法上触发
    public static void detailMethod(){
        System.out.println("this is from detail detail method.");
    }

    //5.异常断点 |  哪里有异常停在哪里  crtl+shift+f8添加
    public static void exception(){
        Object o = null;
        o.toString();
        System.out.println("this is from detail exception.");
    }

    //6.字段断点 | 读写全监控   左键在字段声明的地方
    public static void field(){
        Person p = new Person("lp", 18);
        p.setAge(12);
        System.out.println(p);
        System.out.println("this is from field.");
    }



    public static void main(String[] args) {
//        line();
//        detailLine();
//        method();
//        detailMethod();
//        exception();
        field();
    }
}
