package com.juniorslab;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student", schema = "test")
public class Student {
    public Student() {
    }

    public Student(
            int id,
            String name,
            Integer age,
            Boolean sex
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private int id;
    private String name;
    private Integer age;
    private Boolean sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}

