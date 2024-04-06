package com.example.sga.web.screens.studentsubjectcourse;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.StudentSubjectCourse;

@UiController("sga_StudentSubjectCourse.browse")
@UiDescriptor("student-subject-course-browse.xml")
@LookupComponent("studentSubjectCoursesTable")
@LoadDataBeforeShow
public class StudentSubjectCourseBrowse extends StandardLookup<StudentSubjectCourse> {
}