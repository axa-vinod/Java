/***
 * Name:Aksa Vinod
 * Date: 11-07-2025
 */
package demoProject;
import java.util.Scanner;
public class GradeCalcus {
    public static void main(String[]args) {
    	Scanner scn=new Scanner(System.in);
    	System.out.println("Enter your grade");
    	String grade=scn.nextLine();
        switch(grade) {
    	case "S":
    		System.out.println("Outstanding performance");
    		break;
    	case "A+":
    		System.out.println("Excellent performance");
    		break;
    	case "A":
    		System.out.println("Very Good performance");
    		break;
    	case "B+":
    		System.out.println("Good performance");
    		break;
    	case "B":
    		System.out.println("Average above performance");
    		break;
    	case "C":
    		System.out.println("Average performance");
    		break;
    	default:
    		System.out.println("Enter the correct grade");
        }
        scn.close();
    }
}
