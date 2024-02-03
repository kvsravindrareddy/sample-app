package com.veera.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"ravi","kakarla","D1","NJ", 1000);
        Employee e2 = new Employee(2,"Veera","kakarla","D2","TX",5000);
        Employee e3 = new Employee(3,"Shankar","test","D3","CA",10000);
        Employee e4 = new Employee(1,"ravi","kakarla","D1","NJ", 1000);
        System.out.println(e1.equals(e4));
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

//        for(int i=0;i<employeeList.size();i++) {
//            if(employeeList.get(i).getlName().equalsIgnoreCase("kakarla")) {
//                System.out.println(employeeList.get(i));
//            }
//        }

        List<String> resultEmps = employeeList.stream().filter(emp->emp.getlName().equalsIgnoreCase("kakarla")).map(Employee::getfName).collect(Collectors.toList());
        System.out.println(resultEmps);

        resultEmps.remove(0);
        System.out.println(resultEmps);
    }
}
//Map<Integer, Employee>
//LinkedList and LinkedHashSet
//Insertion order or Insertion order is preserved