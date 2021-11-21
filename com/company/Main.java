package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MemberFactory memberFactory = new MemberFactory();
        System.out.print("Enter The member name : ");
        String memberName = input.nextLine();
        System.out.print("Enter The salary : ");
        double salary = input.nextDouble();
        System.out.print("Enter The Years of Work : ");
        int year = input.nextInt();
        Staff member = memberFactory.desiredMember(memberName);
        member.setSalary(salary);
        member.setYearsOfWork(year);
        System.out.println("Your details for " + memberName + " is:");
        System.out.println("Salary is : " + member.getSalary());
        System.out.println("Years of Work is : " + member.getYearsOfWork());
    }
}
