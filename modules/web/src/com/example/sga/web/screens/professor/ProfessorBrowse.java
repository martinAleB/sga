package com.example.sga.web.screens.professor;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.Professor;

@UiController("sga_Professor.browse")
@UiDescriptor("professor-browse.xml")
@LookupComponent("professorsTable")
@LoadDataBeforeShow
public class ProfessorBrowse extends StandardLookup<Professor> {
}