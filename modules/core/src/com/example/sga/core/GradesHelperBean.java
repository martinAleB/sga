package com.example.sga.core;

import org.springframework.stereotype.Component;

@Component(GradesHelperBean.NAME)
public class GradesHelperBean {
    public static final String NAME = "sga_GradesHelperBean";

    public Double calculateGrade(Double courseGrade, Double finalExamGrade) {
        if(courseGrade == null)
            return null;
        if(courseGrade < 4)
            return courseGrade;
        if(finalExamGrade == null)
            return null;
        if(finalExamGrade < 4)
            return finalExamGrade;
        return (courseGrade + finalExamGrade)/2;
    }
}