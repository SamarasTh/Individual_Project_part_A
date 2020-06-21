/*
 * This is the Menu class. The main menu of the app is written here along with its essential methods that will help the user to manually add the data.
 * 
 * 
 */
package Extras;

import Models.Assignment;
import Models.Course;
import Models.Student;
import Models.Trainer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Course> courseList = new ArrayList<>(); // the list that courses will be saved
    public static ArrayList<Trainer> trainerList = new ArrayList<>();  // the list where trainers will be saved
    public static ArrayList<Assignment> assignList = new ArrayList<>();  // the list where assignments will be saved
    public static ArrayList<Student> studentList = new ArrayList<>();   // the list where students will be saved
    static String exitWhile; // loop variable 

    // method that contains the Menu located in Menu class
    public static void menuDisplayer() {
        System.out.println("Welcome to our school, do you want to add manually the data ? Y/N ");
        String choice = sc.next().toLowerCase();
        if (choice.equals("n")) {
            SyntheticData.fillData();   // method that will import synthetic data, located in SyntheticData class 

        } else {

            System.out.println("OK, first we are going to create the courses of our School");
            createCourse();   

            System.out.println("Now, we are going to create the students, please insert the details required below :");
            createStudent();  

            System.out.println("Moving on, we are going to create the trainer,please insert the details required below :");
            createTrainer();  

            System.out.println("Finally we are going to create the assignments,as before please insert the details required below :");
            createAssignment(); 
        }
        int option;
        System.out.println("All good, our database is now complete");
        do {
            System.out.println("\n");

            System.out.println("\n");
            System.out.println("\nplease press 1 to see Students' list");
            System.out.println("\npress 2 to see Courses' list ");
            System.out.println("\npress 3 to see Trainers' list ");
            System.out.println("\npress 4 to see Asignments' list");
            System.out.println("\npress 5 to see the Students per course ");
            System.out.println("\npress 6 to see the Assignments per course ");
            System.out.println("\npress 7 to see the Trainers per course ");
            System.out.println("\npress 8 to see the Assignments per Student");
            System.out.println("\npress 9 to insert a date and see Pending Assignments for it");
            System.out.println("\nOR 0 to exit");
            System.out.println("\n");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    printStudentList();
                    break;
                case 2:
                    printCourseList();
                    break;
                case 3:
                    printTrainerList();
                    break;
                case 4:
                    printAssignmentsList();
                    break;
                case 5:
                    printStudentsPerCourse();
                    break;
                case 6:
                    printAssignmentsPerCourse();
                    break;
                case 7:
                    printTrainersPerCourse();
                    break;
                case 8:
                    printAssignmentsPerStudent();
                    break;
                case 9:
                     LocalDatesRfun.pendingAssignments(LocalDatesRfun.selectDate());
                    break;
                default:
                    System.out.println("Wrong input, please choose one of the options above");
                    break;
                case 0:
            }
        } while (option != 0);

    }

    private static void createCourse() {

        String title;
        String stream;
        String type;
        String start_date;
        String end_date;

        do {
            System.out.println("Please insert: Course's title ");

            title = sc.next();
            System.out.println("Please insert: Course's stream");
            stream = sc.next();
            System.out.println("please insert: Course's starting date in the following format, dd-MM-yyyy");
            Validation.valDate(start_date = sc.next());
            System.out.println("Please insert: Course's end date in the following format, dd-MM-yyyy");
            Validation.valDate(end_date = sc.next());
            System.out.println("Please insert: Course's type");

            type = sc.next();

            Course cr = new Course(title, stream, type, start_date, end_date);
            courseList.add(cr);

            System.out.println("Do you want to add another Course? (Y/N)");
            exitWhile = sc.next();
        } while (exitWhile.equalsIgnoreCase("Y"));

    } // method that creates a Course object and adds it to the respective list

    private static void createStudent() {
        String firstName;
        String lastName;
        String dateOfBirth;
        float tuitionFees;

        do {
            System.out.println("Please insert: Student's first name ");

            firstName = sc.next();
            System.out.println("Please insert: Student's last name");

            lastName = sc.next();
            System.out.println("Please insert: Student's date of birth in the following format, dd-MM-yyyy");
            Validation.valDate(dateOfBirth = sc.next());

            System.out.println("Please insert: Student's tuition fees, must be a positive double");
            Validation.validateInputFloat(tuitionFees = sc.nextFloat());

            Student st = new Student(firstName, lastName, dateOfBirth, tuitionFees);
            studentList.add(st);

            System.out.println("In which course will the Student participate, please type the respective number ");
            selectCourse().getStudentsPerCourse().getStudentList().add(st);

            System.out.println("Do you want to add another Student? (Y/N)");
            exitWhile = sc.next();
        } while (exitWhile.equalsIgnoreCase("Y"));

    } // method that creates a Student object and adds it to the respective list

    private static void createAssignment() {
        String title;
        String description;
        String subDateTime;
        float oralMark;
        float totalMark;

        do {
            System.out.println("Please insert: Assignment's title");

            title = sc.next();
            System.out.println("Please insert: Assignment's description");

            description = sc.next();

            System.out.println("Please insert: Assignment's submission date");
            Validation.valDate(subDateTime= sc.next());

            System.out.println("Please insert: Student's oral mark in this assignment");
            Validation.validateInputFloat(oralMark = sc.nextFloat());

            System.out.println("Please insert: Student's total mark in this assignment");
            Validation.validateInputFloat(totalMark = sc.nextFloat());

            Assignment asg = new Assignment(title, description, subDateTime, oralMark, totalMark);
            assignList.add(asg);

            System.out.println("In which course will this Assignment be part of, please type the respective number ");
            selectCourse().getAssignmentsPerCourse().getAssignList().add(asg);

            System.out.println("Do you want to add another Assignment? (Y/N)");
            exitWhile = sc.next();
        } while (exitWhile.equalsIgnoreCase("Y"));

    } // method that creates an Assignment object and adds it to the respective list

    private static void createTrainer() {
        String firstName;
        String lastName;
        String subject;

        do {
            System.out.println("Please insert: Trainer's first name ");

            firstName = sc.next();
            System.out.println("Please insert: Trainer's last name");

            lastName = sc.next();
            System.out.println("Please insert: Trainer's subject");
            subject = sc.next();

            Trainer tr = new Trainer(firstName, lastName, subject);
            trainerList.add(tr);

            System.out.println("In which course will this Trainer participate, please type the respective number ");
            selectCourse().getTrainersPerCourse().getTrainerList().add(tr);

            System.out.println("Do you want to add another Trainer? (Y/N)");
            exitWhile = sc.next();
        } while (exitWhile.equalsIgnoreCase("Y"));

    } // method that creates a Trainer object and adds it to the respective list

    public static void printCourseList() {
        System.out.println("\n");
        for (Course x : courseList) {
            System.out.println((courseList.indexOf(x) + 1) + "." + x);
            System.out.println();

        }
    }  // a method that prints Courses

    public static void printStudentList() {
        System.out.println("\n");
        for (Student x : studentList) {
            System.out.println((studentList.indexOf(x) + 1) + "." + x);
            System.out.println();
        }
    }  // a method that prints Students

    public static void printAssignmentsList() {
        System.out.println("\n");
        for (Assignment x : assignList) {
            System.out.println((assignList.indexOf(x) + 1) + "." + x);
            System.out.println();
        }
    }  // a method that prints Assignments

    public static void printTrainerList() {
        System.out.println("\n");
        for (Trainer x : trainerList) {

            System.out.println((trainerList.indexOf(x) + 1) + "." + x);
            System.out.println();
        }

    } // a method that prints Trainers

    public static Course selectCourse() {
        printCourseList();
        int choice = Validation.validateInputArrayList(sc.nextInt(), courseList);
        return courseList.get(choice - 1);

    } // a method with the help of which, user will be able to choose a Course to save specific Students, Trainers , Assignments

    public static Student selectStudent() {
        printStudentList();
        int choice = Validation.validateInputArrayList(sc.nextInt(), courseList);
        return studentList.get(choice - 1);
    } // a method with the help of which, user will be able to choose a Student to save a specific Assignment

    public static void printStudentsPerCourse() {
        System.out.println("\n");
        System.out.println("Select the course to see its Students");
        Course chosenCourse = selectCourse();
        for (int i = 0; i < chosenCourse.getStudentsPerCourse().getStudentList().size(); i++) {

            System.out.println((i + 1) + " . " + chosenCourse.getStudentsPerCourse().getStudentList().get(i));

        }

    } // method that prints Students per course

    public static void printAssignmentsPerCourse() {
        System.out.println("\n");
        System.out.println("Select the course to see its Assignments");
        Course chosenCourse = selectCourse();
        for (int i = 0; i < chosenCourse.getAssignmentsPerCourse().getAssignList().size(); i++) {

            System.out.println((i + 1) + " . " + chosenCourse.getAssignmentsPerCourse().getAssignList().get(i));

        }

    } // method that prints Assignments per course

    public static void printTrainersPerCourse() {
        System.out.println("\n");
        System.out.println("Select the course to see its Trainers");
        Course chosenCourse = selectCourse();
        for (int i = 0; i < chosenCourse.getTrainersPerCourse().getTrainerList().size(); i++) {
            System.out.println((i + 1) + " . " + chosenCourse.getTrainersPerCourse().getTrainerList().get(i));
        }

    } // method that prints Trainers per course

    public static void printAssignmentsPerStudent() {
        System.out.println("\n");
        System.out.println("Select the Student to see his/her Assignments");
        Student chosenStudent = selectStudent();
        for (int i = 0; i < chosenStudent.getAssignmentsPerStudent().getAssignList().size(); i++) {
            System.out.println((i + 1) + " . " + chosenStudent.getAssignmentsPerStudent().getAssignList().get(i));

        }
    } // method that prints Assignments per Students

    
   
}
