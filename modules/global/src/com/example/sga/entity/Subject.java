package com.example.sga.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "SGA_SUBJECT", indexes = {
        @Index(name = "idx_subject_code", columnList = "code")
})
@Entity(name = "sga_Subject")
public class Subject extends StandardEntity {
    private static final long serialVersionUID = -423956351249928702L;

    @ManyToMany
    @JoinTable(name = "SGA_SUBJECT_professors",
            joinColumns = @JoinColumn(name = "subject_ID"),
            inverseJoinColumns = @JoinColumn(name = "professors_ID"))
    private Set<Professor> professors = new LinkedHashSet<>();

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "subjects")
    private Set<Career> careers = new LinkedHashSet<>();

    @OneToMany(mappedBy = "subject", orphanRemoval = true)
    private Set<StudentSubjectCourse> studentSubjectCourses = new LinkedHashSet<>();

    public Set<StudentSubjectCourse> getStudentSubjectCourses() {
        return studentSubjectCourses;
    }

    public void setStudentSubjectCourses(Set<StudentSubjectCourse> studentSubjectCourses) {
        this.studentSubjectCourses = studentSubjectCourses;
    }

    public Set<Career> getCareers() {
        return careers;
    }

    public void setCareers(Set<Career> careers) {
        this.careers = careers;
    }

    public Set<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(Set<Professor> professors) {
        this.professors = professors;
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