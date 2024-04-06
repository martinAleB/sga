package com.example.sga.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "SGA_STUDENT", indexes = {
        @Index(name = "idx_student_college_number", columnList = "college_number")
})
@Entity(name = "sga_Student")
public class Student extends StandardEntity {
    private static final long serialVersionUID = 1517997344585010247L;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "college_number", unique = true)
    private Long collegeNumber;

    @Column(name = "first_name")
    private String firstName;

    @ManyToMany
    @JoinTable(name = "SGA_STUDENT_careers",
            joinColumns = @JoinColumn(name = "student_ID"),
            inverseJoinColumns = @JoinColumn(name = "careers_ID"))
    private Set<Career> careers = new LinkedHashSet<>();

    @OneToMany(mappedBy = "student", orphanRemoval = true)
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

    public Long getCollegeNumber() {
        return collegeNumber;
    }

    public void setCollegeNumber(Long collegeNumber) {
        this.collegeNumber = collegeNumber;
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