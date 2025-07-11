/**
 * Name: Aksa Vinod
 * Date:11-07-2025
 */
package demoProject;

import java.util.Scanner;

public class uptonN {
	public static void main(String[]args) {
    	Scanner scn=new Scanner(System.in);
    	System.out.println("Enter your limit");
    	int limit=scn.nextInt();
    	for(int i=2;i<limit;i+=2) {
    		System.out.println(i);
    	}
 }
}