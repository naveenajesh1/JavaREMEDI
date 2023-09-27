/*
 * File        : Weekday.java
 * Description : Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name
 * Author      : Naveen
 * Version     : 1.0
 * Date        : 27/09/2023
 * 
 */

import java.util.Scanner;
public class Weekday {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		num=sc.nextInt();
	if(num==1)
		{
			System.out.println("MONDAY");
		}
	
	else if (num==2)
		{
			System.out.println("TUESDAY");
		}
	
	else if (num==3)
	    {
		    System.out.println("WEDNESDAY");
	    }
	
	else if (num==4)
	    {
		    System.out.println("THURSDAY");
     	}
	
	else if (num==5)
    	{
		    System.out.println("FRIDAY");
    	}
	
	else if (num==6)
	    {
		    System.out.println("SATURDAY");
    	}
	
	else 
    	{
		    System.out.println("SUNDAY");
    	}
	
	
		}
		}
