package com.mimaraslan.entity;

import java.util.Date;

public class Employee extends Person {

    private Long employeeId;
    private String phone;
    private String email;
    private int salary;
    private Date joinDate;
    private Long department;

    public Employee() {
        super();
    }

    public Employee(String firstname, String lastname, String address,
                    String phone, String email, int salary, Date joinDate, Long department) {
        super(firstname, lastname, address);
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.joinDate = joinDate;
        this.department = department;
    }

    public Employee(String firstname, String lastname, String address) {
        super(firstname, lastname, address);
    }

    public Employee(String phone, String email, int salary, Date joinDate, Long department) {
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.joinDate = joinDate;
        this.department = department;
    }


    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Long getDepartment() {
        return department;
    }

    public void setDepartment(Long department) {
        this.department = department;
    }
}
