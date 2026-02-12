package com.studentapp.model;

public class Professor extends Person {
    private final String department;
    private String title;  // "Assistant Professor", "Associate Professor", "Professor"

    public Professor(String name, int age, String email, int level, String department) {
        super(name, age, email, level);
        this.department = department;
        this.title = "Assistant Professor";
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public String getDepartment() { return department; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}