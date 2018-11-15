package jmxjava.base.collections.unmodifiableList;

import java.util.ArrayList;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class Student {
    private String name;
    private ArrayList<String> courses;

    public Student(String name, ArrayList<String> courses) {
        this.name = name;
        this.courses = courses;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }



}
