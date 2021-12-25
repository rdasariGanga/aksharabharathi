package com.schoolmgmt.aksharabharathi.constants;

import java.util.Objects;

public enum Grade{
    NURSERY("NURSERY"),
    PRE_PRIMARY("PRE PRIMARY"),
    GRADE_1("ONE"),
    GRADE_2("TWO");
    private final String grade;
    private Grade(String grade) {
        this.grade=grade;
    }

    public String getValue(){
        return grade;
    }

    public static Grade getGrade(String gradeDesc){
        for (Grade gr:values()){
             if(Objects.equals(gr.getValue(),gradeDesc)) return gr;
        return null;
    }

}
