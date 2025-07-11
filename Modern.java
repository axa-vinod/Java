/***
 * Name:Aksa Vinod
 * Date: 11-07-2025
 */
package demoProject;
import java.util.Scanner;
public class Modern {
	public static void main(String[]args) {
    	Scanner scn=new Scanner(System.in);
    	System.out.println("Enter your grade");
    	String grade=scn.nextLine();
    	String result= switch(grade) {
    	case "O" ->"Outstanding Performance";
    	case "A+" ->"Excellent Performane";
    	default ->"Invalid code";
    	};
	}
}
