package org.example.StreamAPI.SecondBestSalary;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

class Employees {
    int salary;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employees(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}





public class FindSecondBestSalary    {
public static void main(String [] args)  {

    List<Employees>list = List.of(new Employees(15000,"Anand"),new Employees(18000,"Amruta"),new Employees(13000,"Arpita"));
    Optional<Employees> emp = list.stream().sorted(Comparator.comparing(Employees::getSalary).reversed()).skip(1).findFirst();

    emp.ifPresent(System.out::println);
}



}
