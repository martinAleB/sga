package com.example.sga.web.screens.studentsubjectcourse;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.StudentSubjectCourse;

@UiController("sga_StudentSubjectCourse.edit")
@UiDescriptor("student-subject-course-edit.xml")
@EditedEntityContainer("studentSubjectCourseDc")
@LoadDataBeforeShow
public class StudentSubjectCourseEdit extends StandardEditor<StudentSubjectCourse> {
}