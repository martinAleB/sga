package com.example.sga.web.screens.studentsubjectcourse;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.StudentSubjectCourse;

@UiController("sga_StudentSubjectCourse.edit")
@UiDescriptor("student-subject-course-edit.xml")
@EditedEntityContainer("studentSubjectCourseDc")
@LoadDataBeforeShow
public class StudentSubjectCourseEdit extends StandardEditor<StudentSubjectCourse> {
    private void setGrade(StudentSubjectCourse studentSubjectCourse){
        Double courseGrade = studentSubjectCourse.getCourseGrade();
        if(courseGrade != null) {
            if (courseGrade < 4) {
                studentSubjectCourse.setGrade(courseGrade);
            } else {
                Double finalNote = studentSubjectCourse.getExamFinalGrade();
                if(finalNote != null) {
                    if (finalNote >= 4) {
                        studentSubjectCourse.setGrade((courseGrade + finalNote) / 2.0);
                    } else {
                        studentSubjectCourse.setGrade(finalNote);
                    }
                }
            }
        }
    }

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        StudentSubjectCourse studentSubjectCourse = getEditedEntity();
        Double courseGrade = studentSubjectCourse.getCourseGrade();
        Double examFinalGrade = studentSubjectCourse.getExamFinalGrade();
        Double grade = studentSubjectCourse.getGrade();
        if(grade != null)
            studentSubjectCourse.setGrade(null);
        if(courseGrade != null && (courseGrade < 1 || courseGrade > 10))
            studentSubjectCourse.setCourseGrade(null); // all grades must be a number between 1 and 10
        if(examFinalGrade != null && (examFinalGrade < 1 || examFinalGrade > 10))
            studentSubjectCourse.setExamFinalGrade(null);
        setGrade(studentSubjectCourse);
    }
}