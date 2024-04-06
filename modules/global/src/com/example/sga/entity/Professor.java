package com.example.sga.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "SGA_PROFESSOR", indexes = {
        @Index(name = "idx_professor_code", columnList = "code")
})
@Entity(name = "sga_Professor")
public class Professor extends StandardEntity {
    private static final long serialVersionUID = -7096239922892663027L;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @ManyToMany(mappedBy = "professors")
    private Set<Subject> subjects = new LinkedHashSet<>();

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}