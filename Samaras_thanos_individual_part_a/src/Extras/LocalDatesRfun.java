/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import static Extras.Menu.assignList;
import static Extras.Menu.sc;
import static Extras.Menu.studentList;
import Models.Assignment;
import Models.Student;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;

/**
 *
 * @author ths13
 */
public class LocalDatesRfun {

        public void deadlineGetter(){
        String dateString= "12-01-1990";
        LocalDate dateLocalDate= stringToLocalDate(dateString);
        
        
        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1); // deaclaring the format of the Weeks of the Year. Monday is the first day of the Week and the minimum week can contain 1 day (this is for the first week of the year)
        TemporalField weekOfYear = weekFields.weekOfWeekBasedYear();// declaring a tool that will help us convert a LocalDate date to integer (num of week of the year)
        int weekNumberOfDateLocalDate = dateLocalDate.get(weekOfYear);//converts the dateLocalDate to integer (Num of week of year)
        LocalDate dateToCompare= LocalDate.of(2019, 9, 18);// this is how you set a local date
        int weekNumOfDateToCompare = dateToCompare.get(weekOfYear); //same as line 31
        if (weekNumberOfDateLocalDate== weekNumOfDateToCompare) {
            for (Student x : studentList) {
                for (Assignment y :assignList) {
                    
                  
                    System.out.println(x.getAssignmentsPerStudent());
                    
                }
            }
            
        }else{
           
        }
        }

    public static LocalDate stringToLocalDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //declaring formatter
        LocalDate localDate = LocalDate.parse(dateString, formatter);//converting String to LocalDate
        return localDate;
    }
    
    
    public static boolean compareLocalDates(String dateString1, String dateString2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //declaring formatter
        LocalDate localDate1 = LocalDate.parse(dateString1, formatter);//converting String to LocalDate
        LocalDate localDate2 = LocalDate.parse(dateString2, formatter);//converting String to LocalDate
        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1); // deaclaring the format of the Weeks of the Year. Monday is the first day of the Week and the minimum week can contain 1 day (this is for the first week of the year)
        TemporalField weekOfYear = weekFields.weekOfWeekBasedYear();// declaring a tool that will help us convert a LocalDate date to integer (num of week of the year)
        int weekNumOflocalDate1 = localDate1.get(weekOfYear);
        int yearOflocalDate1 = localDate1.getYear();
        int weekNumOflocalDate2 = localDate2.get(weekOfYear);
        int yearOflocalDate2 = localDate2.getYear();
        
        if (weekNumOflocalDate1==yearOflocalDate2 && yearOflocalDate1==weekNumOflocalDate2) {
            return true;
        }else return false;
    }
    
    public static void pendingAssignments(String chosendate){
        for (int i = 0; i < studentList.size(); i++) {
              
            for (int j = 0; j < studentList.get(i).getAssignmentsPerStudent().getAssignList().size() ; j++) {
                
                if (compareLocalDates(chosendate,studentList.get(i).getAssignmentsPerStudent().getAssignList().get(j).getSubDateTime())) {
                    
                    System.out.println(studentList.get(i));
                }
            }
        }
    }
    
     public static String selectDate(){
            System.out.println("Insert a date to see who has pending assignments");
             String x= Validation.valDate( sc.next());
            return x;
            
    }
}
