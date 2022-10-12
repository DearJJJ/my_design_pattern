package com.myself.algorithm;

public class Person {
    private String name;

    private Integer age;

    public Person buildName(String name) {
        this.name = name;
        return this;
    }

    public Person buildAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
