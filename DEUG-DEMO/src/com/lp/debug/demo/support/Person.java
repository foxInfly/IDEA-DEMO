package com.lp.debug.demo.support;

/**
 * @author lp
 * @since 2022/2/12 20:59
 */

public class Person {
    private String name;
    private String msg;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                ", age=" + age +
                '}';
    }
}
