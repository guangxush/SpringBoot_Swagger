package com.shgx.swagger.model;

/**
 * @author: guangxush
 * @create: 2020/07/03
 */
public class Student {
    private String uid;
    private String name;

    public Student(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
