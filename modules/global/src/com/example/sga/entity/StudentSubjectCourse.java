package com.example.sga.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;

import javax.persistence.*;

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

    @Column(name = "course_note")
    private Double courseNote;

    @Column(name = "note")
    private Double note;

    @Column(name = "exam_final_note")
    private Double examFinalNote;

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Double getExamFinalNote() {
        return examFinalNote;
    }

    public void setExamFinalNote(Double examFinalNote) {
        this.examFinalNote = examFinalNote;
    }

    public Double getCourseNote() {
        return courseNote;
    }

    public void setCourseNote(Double courseNote) {
        this.courseNote = courseNote;
    }
}