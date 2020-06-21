/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;



import java.util.ArrayList;
/**
 *
 * @author ths13
 */
public class TrainersPerCourse {
    
    
    private final ArrayList <Trainer> trainerList ;

    public TrainersPerCourse() {
        this.trainerList = new ArrayList <>();
    }

    public ArrayList<Trainer> getTrainerList() {
        return trainerList;
    }

    @Override
    public String toString() {
        return "TrainersPerCourse{" + trainerList + '}';
    }
    
    
    
}
