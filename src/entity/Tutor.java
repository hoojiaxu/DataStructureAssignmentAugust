/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hoojiaxu
 */
public class Tutor implements Serializable{
    
    private String tutorID;
    private String tutorName;
    private int numberOfSubjects;
    private String subjectName;
    //variable for criteria
    
    public Tutor(){
        
    }
    
    public Tutor(String tutorID, String tutorName, int numberOfSubjects, String subjectName){
        this.tutorID = tutorID;
        this.tutorName = tutorName;
        this.numberOfSubjects = numberOfSubjects;
        this.subjectName = subjectName;
    }
    
    public String getTutorID() {
        return tutorID;
    }

    public void setTutorID(String tutorID) {
        this.tutorID = tutorID;
    }
    
    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
    
    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }
    
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    
}
