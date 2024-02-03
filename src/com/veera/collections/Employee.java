package com.veera.collections;

import java.util.Objects;

public class Employee {
    private int id;
    private String fName;
    private String lName;
    private String dept;
    private String address;
    private int salary;

    public Employee() {

    }
    public Employee(int id, String fName, String lName, String dept, String address, int salary) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.dept = dept;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && salary == employee.salary && Objects.equals(fName, employee.fName) && Objects.equals(lName, employee.lName) && Objects.equals(dept, employee.dept) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fName, lName, dept, address, salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", dept='" + dept + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
