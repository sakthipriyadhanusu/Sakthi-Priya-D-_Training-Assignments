package com.javaAssignment2;

class Student
{
	
	    private String name;
	    private int rollNo;
	    private int marks;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getRollNo() {
	        return rollNo;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public int getMarks() {
	        return marks;
	    }

	    public void setMarks(int marks) {
	        if (marks < 0 || marks > 100) {
	            System.out.println("Invalid marks! Must be between 0 and 100.");
	        } else {
	            this.marks = marks;
	        }
	    }
	}

	


public class Encapsulation {

	public static void main(String[] args) {
		Student s = new Student();
        s.setName("Sakthi");
        s.setRollNo(101);
        s.setMarks(95);
        s.setMarks(150);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Roll Number: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());
		
		
		

	}

}
