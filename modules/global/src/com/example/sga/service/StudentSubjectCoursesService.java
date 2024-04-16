package com.example.sga.service;

import com.example.sga.entity.StudentSubjectCourse;

public interface StudentSubjectCoursesService {
    String NAME = "sga_StudentSubjectCoursesService";

    Double calculateGrade(StudentSubjectCourse course);
}