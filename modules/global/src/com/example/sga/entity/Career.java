package com.example.sga.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "SGA_CAREER", indexes = {
        @Index(name = "idx_career_code", columnList = "code")
})
@Entity(name = "sga_Career")
public class Career extends StandardEntity {
    private static final long serialVersionUID = -4070800225792326029L;

    @Column(name = "name", unique = true)
    private String name;

    @ManyToMany
    @JoinTable(name = "SGA_CAREER_subjects",
            joinColumns = @JoinColumn(name = "career_ID"),
            inverseJoinColumns = @JoinColumn(name = "subjects_ID"))
    private Set<Subject> subjects = new LinkedHashSet<>();

    @Column(name = "code", unique = true)
    private String code;

    @ManyToMany(mappedBy = "careers")
    private Set<Student> students = new LinkedHashSet<>();

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}