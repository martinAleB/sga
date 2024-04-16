package com.example.sga.service;

import com.example.sga.core.GradesHelperBean;
import com.example.sga.entity.StudentSubjectCourse;
import com.haulmont.cuba.core.Persistence;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(StudentSubjectCoursesService.NAME)
public class StudentSubjectCoursesServiceBean implements StudentSubjectCoursesService{
    @Inject
    protected GradesHelperBean gradesHelper;

    @Inject
    protected Persistence persistence;

    @Override
    public Double calculateGrade(StudentSubjectCourse course) {
        return gradesHelper.calculateGrade(course.getCourseGrade(), course.getExamFinalGrade());
    }
}