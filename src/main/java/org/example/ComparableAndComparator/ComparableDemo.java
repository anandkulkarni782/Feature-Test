package org.example.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private int Student_id;
    private String Name;

    public int getStudent_id() {
        return Student_id;
    }

    public String getName() {
        return Name;
    }

    public Student(int student_id, String name) {
        Student_id = student_id;
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student_id=" + Student_id +
                ", Name='" + Name + '\'' +
                '}';
    }



    @Override
    public int compareTo(Student o){
      return  this.Student_id - o.getStudent_id();
    }
}

public class ComparableDemo {

    public static void main(String [] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student(102,"Anand"));
        list.add(new Student(101,"Anagha"));
        Collections.sort(list);
        System.out.println(list);

    }
}
