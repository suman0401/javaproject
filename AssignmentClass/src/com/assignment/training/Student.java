package com.assignment.training;

public class Student {
	String name;
	int studentid;
	
	Student(String name,int studentid){
		this.name=name;
		this.studentid=studentid;
	}
	
	void getDetails() {
		System.out.println("Name "+name);
		System.out.println("Studentid "+studentid);
		
	}
	void getGrades(int[] marks) {
		int sum=0;
		int count=0;
		for(int i:marks) {
			sum+=i;
			count++;
		}

		System.out.println("Sum of marks "+name+"is"+sum);
		float avg = sum/count;
		System.out.println("Average of marks"+name+"is"+avg);
		
		if(avg >=90) {
			System.out.println("Grade A");
		}
		else if(avg >=80 && avg <90) {
			System.out.println("Grade B");
		}
		else {
			System.out.println("Grade C");
		}
			
	}

}
