package com.example.sga.web.screens.studentsubjectcourse;

import com.example.sga.service.StudentSubjectCoursesService;
import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.StudentSubjectCourse;

import javax.inject.Inject;

@UiController("sga_StudentSubjectCourse.edit")
@UiDescriptor("student-subject-course-edit.xml")
@EditedEntityContainer("studentSubjectCourseDc")
@LoadDataBeforeShow
public class StudentSubjectCourseEdit extends StandardEditor<StudentSubjectCourse> {
    @Inject
    protected StudentSubjectCoursesService studentSubjectCoursesService;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        StudentSubjectCourse course = getEditedEntity();
        course.setGrade(studentSubjectCoursesService.calculateGrade(course));
    }
}