package com.assignment.training;
import java.util.Scanner;

public class ConstStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		String stud1name=sc.next();
		System.out.println("Enter the studentid");
		int stud1id=sc.nextInt();
		System.out.println("Enter the number of subjects");
		int sub1=sc.nextInt();
		System.out.println("Enter the marks");
		int marks1[]=new int[sub1];
		for(int i=0;i<sub1;i++) {
			marks1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the name of the student");
		String stud2name=sc.next();
		System.out.println("Enter the studentid");
		int stud2id=sc.nextInt();
		System.out.println("Enter the number of subjects");
		int sub2=sc.nextInt();
		System.out.println("Enter the marks");
		int marks2[]=new int[sub2];
		for(int i=0;i<sub2;i++) {
			marks2[i]=sc.nextInt();
		}
		
		Student stud1=new Student(stud1name,stud1id);
		
		stud1.getDetails();
		stud1.getGrades(marks1);
		System.out.println();
		
		Student stud2=new Student(stud2name,stud2id);
		
		stud2.getDetails();
		stud2.getGrades(marks2);
		sc.close();

	}

}
