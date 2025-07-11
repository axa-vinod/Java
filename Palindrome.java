/***
 * Name:Aksa Vinod
 * Date: 11-07-2025
 */

package demoProject;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[]args) {
    	Scanner scn=new Scanner(System.in);
    	System.out.println("Enter your number");
    	int num=scn.nextInt();
    	int rem,rev=0;
    	int newnum=num;
    	while(num>0) {
    		rem=num%10;
    		rev=rev*10+rem;
    		num=num/10;
    	}
    	if(newnum==rev) {
    		System.out.println("This num is Palindrome");
    	}else {
    		System.out.println("Not a palindrome");
    	}
 }
}