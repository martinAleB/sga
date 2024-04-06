package com.example.sga.web.screens.subject;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.Subject;

@UiController("sga_Subject.browse")
@UiDescriptor("subject-browse.xml")
@LookupComponent("subjectsTable")
@LoadDataBeforeShow
public class SubjectBrowse extends StandardLookup<Subject> {
}