package org.example.ComparableAndComparator;

public class comparableDemo implements Comparable<comparableDemo>{
    int id;
    String Name;

    comparableDemo(int id,String Name) {
     this.id=id;
     this.Name=Name;
    }



    @Override
    public int compareTo(comparableDemo o) {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "comparableDemo{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
