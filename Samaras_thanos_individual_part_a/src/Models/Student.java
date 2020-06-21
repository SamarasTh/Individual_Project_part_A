package Models;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double tuitionFees;
    
   
    private  AssignmentsPerStudent assignmentsPerStudent;

    public Student(String firstName, String lastName, String dateOfBirth, double tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
       
       
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public AssignmentsPerStudent getAssignmentsPerStudent() {
        return assignmentsPerStudent;
    }

   
  

    @Override
    public String toString() {
        return "Student {" + "First Name :" + firstName + ", Last Name :" + lastName + ", Date Of Birth :" + dateOfBirth + ", Tuition Fees :" + tuitionFees + '}';
    }

}
