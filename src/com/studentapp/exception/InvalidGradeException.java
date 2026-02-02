package com.studentapp.exception;

public class InvalidGradeException extends RuntimeException{
    private final int StudentId;
    private final String Name;
    private final String Grade;


    public InvalidGradeException(String message,int studentId, String name, String grade) {
        super(message);
        this.StudentId = studentId;
        this.Name = name;
        this.Grade = grade;
    };

    public InvalidGradeException(int studentId, String name, String grade){
        this("Invalid Grade "+ grade + "was given to "+ name  + "with Student ID:" + studentId, studentId,name,grade);
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getName() {
        return Name;
    }

    public String getGrade() {
        return Grade;
    }
}
