package com.example.sga.web.screens.career;

import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.Career;

@UiController("sga_Career.browse")
@UiDescriptor("career-browse.xml")
@LookupComponent("careersTable")
@LoadDataBeforeShow
public class CareerBrowse extends StandardLookup<Career> {
}