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
public class AssignmentsPerCourse {

    private final ArrayList <Assignment> assignList;

    public AssignmentsPerCourse() {
        this.assignList = new ArrayList <>();
    }

    public ArrayList<Assignment> getAssignList() {
        return assignList;
    }

    @Override
    public String toString() {
        return "AssignmentsPerCourse{" + assignList + '}';
    }
    
    
    
}
