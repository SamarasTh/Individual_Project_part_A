/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import static Extras.Menu.assignList;
import static Extras.Menu.courseList;
import static Extras.Menu.studentList;
import static Extras.Menu.trainerList;
import Models.Course;
import Models.Trainer;
import Models.Student;
import Models.Assignment;
import static Main.Main.*;




public class SyntheticData {
    
    // METHOD THAT WILL IMPORT ALL THE SYNTHETIC DATA WHEN REQUESTED BY USER IN MENU
    public static void fillData(){
         Course course1 = new Course("CB10", "JAVA" , "FULL", "13-10-2019", "13-1-2020");
         courseList.add(course1);
         
         Trainer trainer1 = new Trainer("NIKOS", "KARAPAS", "FRONT END");
         trainerList.add(trainer1);
         course1.getTrainersPerCourse().getTrainerList().add(trainer1);
         
         Trainer trainer12 = new Trainer("DIMITRIS", "APOSTOLOU", "DB");
         trainerList.add(trainer12);
         course1.getTrainersPerCourse().getTrainerList().add(trainer12);
         
         
         Student student1 = new Student("THANOS","SAMARAS","13-11-1992" , 2500.0 ) ;
         studentList.add(student1);
         course1.getStudentsPerCourse().getStudentList().add(student1);
         
         Student student12 = new Student("PARIS", "NIKOU", "5-5-1988", 2000.0);
         studentList.add(student12);
         course1.getStudentsPerCourse().getStudentList().add(student12);
         
         Student student13 = new Student("XARIS", "DIMITRIOU", "15-5-1985", 2000.0);
         studentList.add(student13);
         course1.getStudentsPerCourse().getStudentList().add(student13);
         
         Student student14 = new Student("DIMITRA", "XRISTOU", "15-12-1995", 2500.0);
         studentList.add(student14);
         course1.getStudentsPerCourse().getStudentList().add(student14);
         
         Student student15 = new Student("XRISANTHI", "PAPADIMITRIOU", "1-12-1988", 2500.0);
         studentList.add(student15);
         course1.getStudentsPerCourse().getStudentList().add(student15);
         
         Student student16 = new Student("GIORGOS", "ARGYRIOU", "26-1-1990", 2500.0);
         studentList.add(student16);
         course1.getStudentsPerCourse().getStudentList().add(student16);
         
         Student student17 = new Student("MARIA", "XRISTODOULOU", "30-9-1991", 2500.0);
         studentList.add(student17);
         course1.getStudentsPerCourse().getStudentList().add(student17);
         
         Assignment assignment1 = new Assignment("Individual project part A","Shool app", "1-4-2020", 10f , 70f);
         assignList.add(assignment1);
         course1.getAssignmentsPerCourse().getAssignList().add(assignment1);
         
         Assignment assignment12 = new Assignment("Individual project part B","Shool app", "1-5-2020", 10f , 70f);
         assignList.add(assignment12);
         course1.getAssignmentsPerCourse().getAssignList().add(assignment12);
         
          
         Course course2 = new Course("CB10", "C#", "PART", "13-10-2019" , "16-4-2020");
         courseList.add(course2);
         Trainer trainer2 = new Trainer("PASPARAKIS", "GEORGIOS" , "C#");
         trainerList.add(trainer2);
         trainerList.add(trainer1);
         trainerList.add(trainer12);
         course2.getTrainersPerCourse().getTrainerList().add(trainer2);
         course2.getTrainersPerCourse().getTrainerList().add(trainer1);
         course2.getTrainersPerCourse().getTrainerList().add(trainer12);
         
         Student student2 = new Student("ARGIRIS", "GLAMPEDAKIS","19-7-1990", 2500.0);
         studentList.add(student2);
         course2.getStudentsPerCourse().getStudentList().add(student2);
         Assignment assignment2 = new Assignment("Individual project", "Shool app" , "1-4-2020", 15f , 80f);
         assignList.add(assignment2);
         course2.getAssignmentsPerCourse().getAssignList().add(assignment2);
         
         
         Course course3 = new Course("CB09", "JAVA" , "PART", "14-4-2019", "4-10-2019");
         courseList.add(course3);
         Trainer trainer3 = new Trainer("IRAKLIDIS", "GEORGIOS", "JAVA");
         trainerList.add(trainer3);
         course3.getTrainersPerCourse().getTrainerList().add(trainer3);
         Student student3 = new Student("MAVROMATIS" , "AKIS", "11-11-1988", 2500.0);
         studentList.add(student3);
         course3.getStudentsPerCourse().getStudentList().add(student3);
         Assignment assignment3 = new Assignment("Individual project", "Shool app" , "1-4-2020", 18f , 98f);
         assignList.add(assignment3);
         course3.getAssignmentsPerCourse().getAssignList().add(assignment3);
         
         
         
         
    }  
    
}
