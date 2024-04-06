package com.example.sga.web.screens.subject;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.Subject;

@UiController("sga_Subject.edit")
@UiDescriptor("subject-edit.xml")
@EditedEntityContainer("subjectDc")
@LoadDataBeforeShow
public class SubjectEdit extends StandardEditor<Subject> {
}