package com.studentapp.model;

import com.studentapp.exception.InvalidGradeException;



public class Student extends Person{
    private final String course;      // What course they're in
    private double grade;              // Their current grade (can change)
    private String major;

    public Student(String name, int age, String email, int Level, String Course) {
        super(name, age, email, Level);

        this.course = Course;
        this.grade = 0.0;
        this.major = "Undeclared";
    }

    @Override
    public String getRole() {
        return "Student";
    }


    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException(this.getId(), this.getName(), grade);
        }
        this.grade = grade;
    }

    public String getCourse() { return course; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public String getLetterGrade() {
        if (grade >= 90) return "A";
        if (grade >= 80) return "B";
        if (grade >= 70) return "C";
        if (grade >= 60) return "D";
        return "F";
    }

    public boolean isPassing() {
        return grade >= 60;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", email='" + getEmail() + '\'' +
                ", level=" + getLevel() +
                ", course='" + course + '\'' +
                ", grade=" + grade + " (" + getLetterGrade() + ")" +
                ", major='" + major + '\'' +
                '}';
    }


}
