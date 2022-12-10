package com.hospital.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EMPID")
    int empId;
    String empName;
    String contact;
    String email;
    String address;
    float age;
    LocalDate dob;
    LocalDate doj;
    LocalDate doe;
    double salary;
    String paymentMethod;
    String designation;
    String department;
    String qualification;
    public Employee(){}

    public Employee(int empId, String empName, String contact, String email, String address, float age, LocalDate dob, LocalDate doj, LocalDate doe, double salary, String paymentMethod, String designation, String department, String qualification) {
        this.empId = empId;
        this.empName = empName;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.age = age;
        this.dob = dob;
        this.doj = doj;
        this.doe = doe;
        this.salary = salary;
        this.paymentMethod = paymentMethod;
        this.designation = designation;
        this.department = department;
        this.qualification = qualification;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public LocalDate getDoe() {
        return doe;
    }

    public void setDoe(LocalDate doe) {
        this.doe = doe;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", doj=" + doj +
                ", doe=" + doe +
                ", salary=" + salary +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
