/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import static Extras.Menu.sc;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *This class includes all the validation methods used to restrict user 's inputs.
 * @author ths13
 */
public class Validation {

    public static int validateInputArrayList(int x, ArrayList lista) {
        if (x <= lista.size() && x > 0) {
            return x;
        } else {
            System.out.println("Wrong input - the list has " + lista.size() + " elements");
            return validateInputArrayList(sc.nextInt(), lista);
        }
    }

    public static double validateInputFloat(float x) {
        if (x <= 0) {
            System.out.println("Wrong input, insert positive");
            return validateInputFloat(sc.nextFloat());
        } else {
            return x;
        }
    }

    public static String valDate(String x) {
        if (StringToDate(x)) {
            return x;
        } else {
            System.out.println("Wrong input : Please insert the date in the format of dd-MM-yyyy with acceptable values");
            return valDate(sc.next());
        }
    } // checks if user used correct format to input a date

    public static boolean StringToDate(String x) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        df.setLenient(false);

        try {
            date = df.parse(x.trim());
            return true;
        } catch (ParseException e) {

            return false;

        }
    } // trasnforms user input's String to a specific date format

}
