package jmxjava.base.collections.unmodifiableList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jiaomx on 2017/7/18.
 */

public class Student1 {
    private String name;
    private ArrayList<String> courses;

    public Student1(String name, ArrayList<String> courses) {
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
        return (ArrayList<String>) Collections.unmodifiableCollection(courses);
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }



}
