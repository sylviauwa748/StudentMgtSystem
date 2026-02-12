package com.studentapp.exception;

import java.util.UUID;

public class InvalidGradeException extends RuntimeException{
    private final UUID studentId;
    private final String name;
    private final double grade;


    public InvalidGradeException(String message,UUID StudentId, String Name, double Grade) {
        super(message);
        this.studentId = StudentId;
        this.name = Name;
        this.grade = Grade;
    }

    public InvalidGradeException(UUID studentId, String name, double grade){
        this("Invalid Grade "+ grade + "was given to "+ name  + "with Student ID:" + studentId, studentId,name,grade);
    }

    public UUID getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}
