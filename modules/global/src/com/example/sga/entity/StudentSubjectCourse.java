package com.example.sga.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@PublishEntityChangedEvents
@Table(name = "SGA_STUDENT_SUBJECT_COURSE")
@Entity(name = "sga_StudentSubjectCourse")
public class StudentSubjectCourse extends StandardEntity {
    private static final long serialVersionUID = 4551706412009326275L;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Min(value = 1)
    @Max(value = 10)
    @Column(name = "course_grade")
    private Double courseGrade;

    @Column(name = "grade")
    private Double grade;

    @Column(name = "exam_final_grade")
    private Double examFinalGrade;

    @Column(name = "consolidated", nullable = false)
    private Boolean consolidated;

    public Boolean getConsolidated() {
        return consolidated;
    }

    public void setConsolidated(Boolean consolidated) {
        this.consolidated = consolidated;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double note) {
        this.grade = note;
    }

    public Double getExamFinalGrade() {
        return examFinalGrade;
    }

    public void setExamFinalGrade(Double examFinalGrade) {
        this.examFinalGrade = examFinalGrade;
    }

    public Double getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(Double courseGrade) {
        this.courseGrade = courseGrade;
    }
}