package com.example.studentreportcard;

public class word {

    private String studentName;

    private String studentGrade1;

    private String studentGrade2;

    private String studentGrade3;




    public word(String NewStudentName, String NewStudentGrade1, String NewStudentGrade2, String NewStudentGrade3){

        studentName = NewStudentName;
        studentGrade1 =  NewStudentGrade1;
        studentGrade2 = NewStudentGrade2;
        studentGrade3 = NewStudentGrade3;

    }

    //get Student Name
    public String getStudentName(){
        return studentName;
    }



    //Get StudentGrade1
    public String getStudentGrade1(){
        return studentGrade1;
    }
    //Get StudentGrade2
    public String getStudentGrade2(){
        return studentGrade2;
    }
    //Get StudentGrade3
    public String getStudentGrade3(){
        return studentGrade3;
    }




}