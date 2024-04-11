package com.example.sga.web.screens.studentsubjectcourse;

import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.components.Actions;
import com.haulmont.cuba.gui.components.ActionsAwareDialogFacet;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.example.sga.entity.StudentSubjectCourse;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collection;

@UiController("sga_StudentSubjectCourse.browse")
@UiDescriptor("student-subject-course-browse.xml")
@LookupComponent("studentSubjectCoursesTable")
@LoadDataBeforeShow
public class StudentSubjectCourseBrowse extends StandardLookup<StudentSubjectCourse> {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(StudentSubjectCourseBrowse.class);
    @Named("studentSubjectCoursesTable.edit")
    private EditAction<StudentSubjectCourse> studentSubjectCoursesTableEdit;
    @Inject
    private Table<StudentSubjectCourse> studentSubjectCoursesTable;

    @Subscribe
    public void onInit(InitEvent event) {
        super.initActions(event);

        studentSubjectCoursesTableEdit.addEnabledRule(() -> {
            StudentSubjectCourse studentSubjectCourse = studentSubjectCoursesTable.getSingleSelected();
            return studentSubjectCourse != null && !studentSubjectCourse.getConsolidated();
        });
    }
}