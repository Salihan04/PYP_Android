package com.humblecoder.pyp.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by User on 22-Sep-14.
 */
@ParseClassName("Paper")
public class Paper extends ParseObject {

    public Paper() {}

    public static String getParseClassName() {
        return "Paper";
    }

    public String getPaperId() {return getObjectId();}

    public String getAcademicYear() {
        return getString("academicYear");
    }

    public void setAcademicYear(String academicYear) {
        put("academicYear", academicYear);
    }

    public int getSemester() {
        return getInt("semester");
    }

    public void setSemester(int semester) {
        put("semester", semester);
    }

    public ParseObject getCourse() {
        return getParseObject("course");
    }

    public void setCourse(Course course) {
        put("course", course);
    }
}
