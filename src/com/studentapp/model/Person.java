package com.studentapp.model;

import java.util.UUID;

public abstract class Person {
    private final UUID id;
    private final String name;
    private final int age;
    private final String email;
    private int level;  // Mutable - can change over time

    protected Person(String name, int age, String email, int level) {
        // Validation
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age: " + age);
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email: " + email);
        }

        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.email = email;
        this.level = level;
    }


    public abstract String getRole();


    public UUID getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public int getLevel() { return level; }


    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return getRole() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}