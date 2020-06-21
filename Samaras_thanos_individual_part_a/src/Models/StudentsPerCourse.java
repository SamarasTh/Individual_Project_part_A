/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import java.util.ArrayList;

/**
 *
 * @author θανος
 */
public class StudentsPerCourse {

    private final ArrayList <Student> studentList ;

    public StudentsPerCourse() {
        this.studentList = new ArrayList <>();        
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "StudentsPerCourse{" + studentList + '}';
    }
    
    
    
}
