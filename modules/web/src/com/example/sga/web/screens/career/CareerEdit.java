package com.example.sga.web.screens.career;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.Career;

@UiController("sga_Career.edit")
@UiDescriptor("career-edit.xml")
@EditedEntityContainer("careerDc")
@LoadDataBeforeShow
public class CareerEdit extends StandardEditor<Career> {
}