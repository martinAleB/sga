package com.example.sga.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.Student;

@UiController("sga_Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
@LoadDataBeforeShow
public class StudentBrowse extends StandardLookup<Student> {
}