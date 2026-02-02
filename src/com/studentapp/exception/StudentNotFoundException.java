package com.studentapp.exception;

public class StudentNotFoundException extends RuntimeException{
    private final int StudentId;


    public StudentNotFoundException(String message,int studentId ){
        super(message);
        this.StudentId = studentId;

    }

    public StudentNotFoundException(int studentId){
        this("This account with ID:"+" "+ studentId + "was NOT FOUND!", studentId);

    }

    public int getStudentId() {
        return StudentId;
    }


}
