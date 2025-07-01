package org.example.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class student {
    private int id;
    private String Name;

    public student(String name, int id) {
        Name = name;
        this.id = id;
    }

    public student() {
}

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }
}

class Emp {

    int salary;
    String Name;
    String Department;

    public int getEmployee_salary() {
        return salary;
    }

    public String getDepartment() {
        return Department;
    }

    public String getName() {
        return Name;
    }

    public void setEmployee_salary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "salary=" + salary +
                ", Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }

    public void setName(String name) {
        Name = name;

    }


    public Emp(int salary, String name,String department) {
        this.salary = salary;
        this.Name = name;
        this.Department = department;
    }
}

public class Filter_Programs {
    public static void main(String [] args) {
        // 1] Filter Even Numbers from a List.
        Integer [] array ={1,2,3,5,8,2,7};
        List<Integer>  list = Arrays.asList(array);
        list.stream().filter(even -> even % 2 ==0).forEach(even -> System.out.print(even));


        //  Filter Strings that Start with a Particular Letter
        List<String> l = List.of("Anand","Anagha","Amruta");
        l.stream().filter(word -> word.startsWith("A")).collect(Collectors.toList());
        System.out.println(l);

        // Filter Students from a Particular Student by Id
        List<student> list1 = List.of(new student("anand",1),new student("anagha",2));
       List<student> filtered =  list1.stream().filter(num -> num.getId()==1 ).collect(Collectors.toList());
        filtered.stream().forEach(num -> System.out.println(num));

       // Filter Employess whose salary is greater than 3000
       // Filter Employees by Department

        List<Emp> emp = List.of(new Emp(5000,"anand","computer"),new Emp(3000,"Anagha","Snow"));
        List<Emp> result = emp.stream().filter(ak -> ak.getDepartment().matches("Computer")).collect(Collectors.toList());
        System.out.println(result);

        // Filter Distinct Even Numbers
        List<Integer> dist = Arrays.asList(1,2,3,4,6,7,3,-1);
        dist.stream().filter(res -> res%2 ==0).distinct().collect(Collectors.toList()).forEach(res -> System.out.println(res));

       // Filter Negative Numbers
        dist.stream().filter(res1 -> res1 <0).collect(Collectors.toList()).forEach(res1 -> System.out.println(res1));






    }

}
