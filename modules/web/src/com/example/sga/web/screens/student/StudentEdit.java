package com.example.sga.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.Student;

@UiController("sga_Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
@LoadDataBeforeShow
public class StudentEdit extends StandardEditor<Student> {
}