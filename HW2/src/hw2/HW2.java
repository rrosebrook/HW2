/*Rachel Rosebrook
September 2017
HW2 - Create an array and a linkedlist to help assess bordering countries and population of countries.
*/
package hw2;

import java.util.Scanner;
import java.util.LinkedList;


/**
 *
 * @author Owner
 */
public class HW2 {

    static String option;
    static String filelocation;
    static String[] countryArray;
    
    /**
     * @param args the command line arguments
     */
    public static void userDecision() {
        System.out.println("What would you like to do?");
        System.out.println("Type 'i' to add the location of a file.");
        System.out.println("Type 'b' to get a list of all border countries");
        System.out.println("Type 'p' to get a list of all countries with a population greater than 32 million.");
        System.out.println("Type 'a' to get a list of all countries with a population greater than 32 million bordering a specific country.");
        System.out.println("And type 'q' to quit.");
        Scanner userinput = new Scanner(System.in);
        option = userinput.nextLine();
	System.out.println("You have entered: " + option);
    }
    
    public static void getFile() {
        System.out.println("What is the location of the file?");
        Scanner fileloc = new Scanner(System.in);
        filelocation = fileloc.nextLine();
        System.out.println("The location you have entered is: " + filelocation);
    }
    
    public static void main(String[] args) {
        userDecision();
        if(option.equalsIgnoreCase("i")) {
        getFile();
        }
        // TODO code application logic here
    }
    
}
