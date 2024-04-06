package com.example.sga.web.screens.professor;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.Professor;

@UiController("sga_Professor.edit")
@UiDescriptor("professor-edit.xml")
@EditedEntityContainer("professorDc")
@LoadDataBeforeShow
public class ProfessorEdit extends StandardEditor<Professor> {
}