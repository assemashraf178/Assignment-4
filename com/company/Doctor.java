package com.company;

public class Doctor implements Staff{
    private double salary;
    private int yearsOfWork;
    private java.util.Date date = new java.util.Date();

    @Override
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public void setYearsOfWork(int yearsOfWork) {
        this.yearsOfWork = yearsOfWork;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public int getYearsOfWork() {
        return yearsOfWork;
    }
}
